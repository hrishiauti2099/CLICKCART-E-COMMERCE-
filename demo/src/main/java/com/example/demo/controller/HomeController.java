package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    // Map "/home" to the homepage template (home.html)
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("products", productService.getAllProducts()); // Featured products
        return "home";  // This should refer to your home.html
    }

    // Redirect the root URL "/" to "/home"
    @GetMapping("/")
    public String defaultHome() {
        return "redirect:/home";
    }
}
