package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/mobile-phones")
    public String showMobilePhones(Model model) {
        List<Product> mobilePhones = productRepository.findByCategory("Smartphones");
        model.addAttribute("products", mobilePhones);
        return "mobile_phones"; // Matches `mobile_phones.html` in `templates/`
    }

    @GetMapping("/laptops")
    public String showLaptops(Model model) {
        List<Product> laptops = productRepository.findByCategory("Laptops");
        model.addAttribute("products", laptops);
        return "laptops"; // Matches `laptops.html` in `templates/`
    }

    @GetMapping("/Accessories")
    public String showAccessories(Model model) {
        List<Product> accessories = productRepository.findByCategory("Accessories");
        model.addAttribute("products", accessories);
        return "Accessories"; // Matches `accessories.html` in `templates/`
    }

        @GetMapping("/men")
        public String showMenCategory (Model model){
            List<Product> menProducts = productRepository.findByCategory("Men");
            model.addAttribute("products", menProducts);
            return "men"; // Matches `men.html` in `templates/`
        }

    @GetMapping("/women")
    public String showWomenCategory (Model model){
        List<Product> menProducts = productRepository.findByCategory("Women");
        model.addAttribute("products", menProducts);
        return "women"; // Matches `women.html` in `templates/`
    }

    @GetMapping("/Kids")
    public String showKidsCategory(Model model) {
        List<Product> kidsProducts = productRepository.findByCategory("Kids");
        model.addAttribute("products", kidsProducts);
        return "Kids";
    }

    @GetMapping("/Sneakers")
    public String showSneakersCategory(Model model) {
        List<Product> sneakers = productRepository.findByCategory("Sneakers");
        model.addAttribute("products", sneakers);
        return "Sneakers";
    }

    @GetMapping("/Formal_Shoes")
    public String showFormalShoesCategory(Model model) {
        List<Product> formalShoes = productRepository.findByCategory("Formal_Shoes");
        model.addAttribute("products", formalShoes);
        return "Formal_Shoes";
    }

    @GetMapping("/Sports_Shoes")
    public String showSportsShoesCategory(Model model) {
        List<Product> sportsShoes = productRepository.findByCategory("Sports_Shoes");
        model.addAttribute("products", sportsShoes);
        return "Sports_Shoes";
    }

    @GetMapping("/Fruits_Vegetables")
    public String showFruitsVegetablesCategory(Model model) {
        List<Product> fruitsVegetables = productRepository.findByCategory("Fruits_Vegetables");
        model.addAttribute("products", fruitsVegetables);
        return "Fruits_Vegetables";
    }

    @GetMapping("/Dairy_Bakery")
    public String showDairyBakeryCategory(Model model) {
        List<Product> dairyBakery = productRepository.findByCategory("Dairy_Bakery");
        model.addAttribute("products", dairyBakery);
        return "Dairy_Bakery";
    }

    @GetMapping("/Snacks_Beverages")
    public String showSnacksBeveragesCategory(Model model) {
        List<Product> snacksBeverages = productRepository.findByCategory("Snacks_Beverages");
        model.addAttribute("products", snacksBeverages);
        return "Snacks_Beverages";
    }

    @GetMapping("/Furniture")
    public String showFurnitureCategory(Model model) {
        List<Product> furniture = productRepository.findByCategory("Furniture");
        model.addAttribute("products", furniture);
        return "Furniture";
    }

    @GetMapping("/Cookware")
    public String showCookwareCategory(Model model) {
        List<Product> cookware = productRepository.findByCategory("Cookware");
        model.addAttribute("products", cookware);
        return "Cookware";
    }

    @GetMapping("/Home_Decor")
    public String showHomeDecorCategory(Model model) {
        List<Product> homeDecor = productRepository.findByCategory("Home_Decor");
        model.addAttribute("products", homeDecor);
        return "Home_Decor";
    }

    @GetMapping("/Skincare")
    public String showSkincareCategory(Model model) {
        List<Product> skincare = productRepository.findByCategory("Skincare");
        model.addAttribute("products", skincare);
        return "Skincare";
    }

    @GetMapping("/Makeup")
    public String showMakeupCategory(Model model) {
        List<Product> makeup = productRepository.findByCategory("Makeup");
        model.addAttribute("products", makeup);
        return "Makeup";
    }

    @GetMapping("/Hair_Care")
    public String showHairCareCategory(Model model) {
        List<Product> hairCare = productRepository.findByCategory("Hair_Care");
        model.addAttribute("products", hairCare);
        return "Hair_Care";
    }

    @GetMapping("/Supplements")
    public String showSupplementsCategory(Model model) {
        List<Product> supplements = productRepository.findByCategory("Supplements");
        model.addAttribute("products", supplements);
        return "Supplements";
    }

    @GetMapping("/Fitness_Equipment")
    public String showFitnessEquipmentCategory(Model model) {
        List<Product> fitnessEquipment = productRepository.findByCategory("Fitness_Equipment");
        model.addAttribute("products", fitnessEquipment);
        return "Fitness_Equipment";
    }

    @GetMapping("/Activewear")
    public String showActivewearCategory(Model model) {
        List<Product> activewear = productRepository.findByCategory("Activewear");
        model.addAttribute("products", activewear);
        return "Activewear";
    }

    @GetMapping("/Fiction")
    public String showFictionCategory(Model model) {
        List<Product> fiction = productRepository.findByCategory("Fiction");
        model.addAttribute("products", fiction);
        return "Fiction";
    }

    @GetMapping("/Non_Fiction")
    public String showNonFictionCategory(Model model) {
        List<Product> nonFiction = productRepository.findByCategory("Non-Fiction");
        model.addAttribute("products", nonFiction);
        return "Non_Fiction";
    }

    @GetMapping("/Educational")
    public String showEducationalCategory(Model model) {
        List<Product> educational = productRepository.findByCategory("Educational");
        model.addAttribute("products", educational);
        return "Educational";
    }

    @GetMapping("/Educational_Toys")
    public String showEducationalToysCategory(Model model) {
        List<Product> educationalToys = productRepository.findByCategory("Educational_Toys");
        model.addAttribute("products", educationalToys);
        return "Educational_Toys";
    }

    @GetMapping("/Baby_Essentials")
    public String showBabyEssentialsCategory(Model model) {
        List<Product> babyEssentials = productRepository.findByCategory("Baby_Essentials");
        model.addAttribute("products", babyEssentials);
        return "Baby_Essentials";
    }

    @GetMapping("/Kids_Apparel")
    public String showKidsApparelCategory(Model model) {
        List<Product> kidsApparel = productRepository.findByCategory("Kids_Apparel");
        model.addAttribute("products", kidsApparel);
        return "Kids_Apparel";
    }

    @GetMapping("/Car_Accessories")
    public String showCarAccessoriesCategory(Model model) {
        List<Product> carAccessories = productRepository.findByCategory("Car_Accessories");
        model.addAttribute("products", carAccessories);
        return "Car_Accessories";
    }

    @GetMapping("/Bike_Accessories")
    public String showBikeAccessoriesCategory(Model model) {
        List<Product> bikeAccessories = productRepository.findByCategory("Bike_Accessories");
        model.addAttribute("products", bikeAccessories);
        return "Bike_Accessories";
    }

    @GetMapping("/Tools_Gadgets")
    public String showToolsGadgetsCategory(Model model) {
        List<Product> toolsGadgets = productRepository.findByCategory("Tools_Gadgets");
        model.addAttribute("products", toolsGadgets);
        return "Tools_Gadgets";
    }




}
