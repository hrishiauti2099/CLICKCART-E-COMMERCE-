package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void saveAllProducts(List<Product> products) {
        productRepository.saveAll(products);

    }

    // Find product by ID
    public Product getProductById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + productId));
    }

    public List<Product> searchProducts(String query) {
        String queryLowerCase = query.toLowerCase().trim();
        List<Product> allProducts = productRepository.findAll();

        // Print all products to check if they are loaded correctly
        System.out.println("All products loaded:");
        allProducts.forEach(product -> System.out.println("Product ID: " + product.getId() + ", Name: " + product.getName() + ", Category: " + product.getCategory()));

        return allProducts.stream()
                .filter(product -> product.getName().toLowerCase().contains(queryLowerCase))
                .collect(Collectors.toList());
    }




    // Handle stock update when a product is purchased
    public boolean purchaseProduct(Long productId, int quantity) {
        Optional<Product> optionalProduct = productRepository.findById(productId);

        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            if (product.getStockQuantity() >= quantity) {
                product.setStockQuantity(product.getStockQuantity() - quantity);
                productRepository.save(product);
                return true; // Purchase successful
            } else {
                return false; // Not enough stock
            }
        }
        return false; // Product not found
    }


    }

