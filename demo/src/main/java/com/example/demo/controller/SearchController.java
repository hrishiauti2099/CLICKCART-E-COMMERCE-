package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public String searchProducts(@RequestParam("query") String query, RedirectAttributes redirectAttributes) {
        // Find products matching the query
        List<Product> searchResults = productService.searchProducts(query);

        if (searchResults != null && !searchResults.isEmpty()) {
            // Get the first matching product (for simplicity)
            Product firstMatch = searchResults.get(0);
            System.out.println("Found product: " + firstMatch.getName()); // Debugging

            // Redirect based on the category of the product
            String category = firstMatch.getCategory().toLowerCase().replace(" ", "-");

            // Redirect to the corresponding category page
            switch (category) {
                case "mobile-phones":
                    return "redirect:/mobile_phones"; // Redirect to mobile_phones.html
                case "laptops":
                    return "redirect:/laptops"; // Redirect to laptops.html
                case "tablets":
                    return "redirect:/tablets"; // Redirect to tablets.html
                case "headphones":
                    return "redirect:/headphones"; // Redirect to headphones.html
                // Add more categories as necessary
                default:
                    return "redirect:/home"; // Default redirect to home page
            }
        }

        // If no results are found, add a message and redirect to the home page
        System.out.println("No products found for query: " + query); // Debugging
        redirectAttributes.addFlashAttribute("message", "No products found for: " + query);
        return "redirect:/home";
    }
}
