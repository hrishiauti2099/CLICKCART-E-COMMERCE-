package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class SampleDataLoader implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
// Add mobile phone products to the database
        productRepository.save(new Product("iPhone 14", "The latest Apple smartphone featuring an advanced A15 Bionic chip, Super Retina XDR display, and dual-camera system for stunning photos and videos.", BigDecimal.valueOf(99999), "/iPhone-14images.jpg", 10, "Smartphones", "Apple"));
        productRepository.save(new Product("Samsung Galaxy S23", "A high-end Android flagship with a powerful Snapdragon processor, Dynamic AMOLED 2X display, and a pro-grade camera system for ultimate performance.", BigDecimal.valueOf(89999), "/Samsung-Galaxy-S23-2.jpg", 12, "Smartphones", "Samsung"));
        productRepository.save(new Product("OnePlus 11", "A fast-charging premium smartphone featuring a Snapdragon 8 Gen 2 processor, Hasselblad-tuned triple cameras, and a 120Hz AMOLED display for smooth performance.", BigDecimal.valueOf(69999), "/one plus11.png", 15, "Smartphones", "OnePlus"));

// Add laptop products to the database
        productRepository.save(new Product("Dell XPS 15", "A powerful laptop featuring a stunning 4K OLED display, Intel Core i9 processor, and NVIDIA graphics, perfect for professionals and creatives.", BigDecimal.valueOf(159999), "/delllappy.jpg", 8, "Laptops", "Dell"));
        productRepository.save(new Product("MacBook Pro 16", "Apple's top-tier MacBook with the latest M2 Pro/Max chip, Liquid Retina XDR display, and long battery life, designed for high-performance tasks.", BigDecimal.valueOf(249999), "/MacBook Pro 16.jpeg", 5, "Laptops", "Apple"));
        productRepository.save(new Product("Asus ROG Zephyrus", "A high-performance gaming laptop equipped with an NVIDIA RTX 4090 GPU, AMD Ryzen 9 processor, and ultra-fast refresh rate display for seamless gameplay.", BigDecimal.valueOf(189999), "/Asus ROG Zephyrus.jpg", 10, "Laptops", "Asus"));
        productRepository.save(new Product("HP Spectre x360", "A premium 2-in-1 convertible laptop with a sleek design, OLED touchscreen, Intel Evo-certified performance, and all-day battery life for professionals on the go.", BigDecimal.valueOf(139999), "/HP Spectre x360.jpg", 7, "Laptops", "HP"));

        // Add accessories products to the database
        productRepository.save(new Product("Sony WH-1000XM5", "Premium noise-canceling wireless headphones with industry-leading sound quality, long battery life, and touch controls.", BigDecimal.valueOf(29999), "/Sony WH-1000XM5.jpg", 15, "Accessories", "Sony"));
        productRepository.save(new Product("Apple AirPods Pro", "High-quality wireless earbuds with active noise cancellation, transparency mode, and spatial audio for an immersive sound experience.", BigDecimal.valueOf(24999), "/Apple AirPods Pro.jpg", 20, "Accessories", "Apple"));
        productRepository.save(new Product("Samsung 25W Fast Charger", "Official Samsung USB-C fast charger with super-fast charging support, compatible with multiple devices including Galaxy smartphones and tablets.", BigDecimal.valueOf(1999), "/Samsung 25W Fast Charger.jpg", 30, "Accessories", "Samsung"));

// Men's Clothing {done adding images still here} below this are left
        productRepository.save(new Product("Leather Jacket", "Stylish and durable premium leather jacket for men, designed for comfort and protection, perfect for casual and biker wear.", BigDecimal.valueOf(7999), "/Leather Jacket.jpg", 20, "Men", "FashionCo"));
        productRepository.save(new Product("Formal Shirt", "Elegant cotton blend formal shirt with a slim-fit design, perfect for office wear and business meetings.", BigDecimal.valueOf(2499), "/Formal Shirt.jpg", 30, "Men", "Raymond"));
        productRepository.save(new Product("Blue Jeans", "Lightweight and breathable with cushioned , designed for comfort  and daily wear.", BigDecimal.valueOf(4999), "/blue jeansss.jpg", 25, "Men", "Nike"));

// Women's Clothing
        productRepository.save(new Product("Elegant Evening Gown", "A sophisticated and stylish long gown made with premium fabric, designed for special occasions like parties and formal events.", BigDecimal.valueOf(4999), "elegent gown women.jpg", 8, "Women", "Clothing"));
        productRepository.save(new Product("Casual Summer Dress", "Lightweight and breathable summer dress with a floral design, ideal for warm weather and casual outings.", BigDecimal.valueOf(1999), "Casual Summer Dress.png", 20, "Women", "Clothing"));
        productRepository.save(new Product("Leather Handbag", "A premium-quality leather handbag with spacious compartments, sturdy handles, and a stylish design for everyday use.", BigDecimal.valueOf(3499), "/leather-handbag.jpg", 15, "Women", "Accessories"));

// Kids' Clothing
        productRepository.save(new Product("Kids' T-Shirt", "Soft and comfortable cotton t-shirt with fun prints, perfect for everyday wear and outdoor activities.", BigDecimal.valueOf(499), "/kids_tshirt.jpg", 20, "Kids", "Brand A"));
        productRepository.save(new Product("Kids' Jeans", "Durable and stylish denim jeans designed for active kids, with an elastic waistband for extra comfort.", BigDecimal.valueOf(899), "/kids_jeans.jpg", 15, "Kids", "Brand B"));
        productRepository.save(new Product("Kids' Jacket", "Warm and cozy winter jacket made with high-quality insulation, designed to keep kids comfortable in cold weather.", BigDecimal.valueOf(1299), "/kids_jacket.jpg", 10, "Kids", "Brand C"));

// Sneakers
        productRepository.save(new Product("Nike Air Max", "High-performance sneakers designed for maximum comfort and durability, featuring a cushioned sole for enhanced support.", BigDecimal.valueOf(6999), "/nike_airmax.jpg", 10, "Sneakers", "Nike"));
        productRepository.save(new Product("Adidas Ultraboost", "Premium running shoes with responsive cushioning and a lightweight design, perfect for long-distance running.", BigDecimal.valueOf(7999), "/adidas_ultraboost.jpg", 12, "Sneakers", "Adidas"));
        productRepository.save(new Product("Puma RS-X", "Trendy streetwear sneakers with a bold design and superior grip, ideal for casual and athletic wear.", BigDecimal.valueOf(7499), "/puma_rsx.jpg", 14, "Sneakers", "Puma"));

// Formal Shoes
        productRepository.save(new Product("Leather Oxford Shoes", "Classic formal shoes made from genuine leather with a sleek finish, perfect for business meetings and formal events.", BigDecimal.valueOf(4999), "/oxford_shoes.jpg", 8, "Formal_Shoes", "Brand C"));
        productRepository.save(new Product("Derby Shoes", "Elegant and stylish derby shoes with a comfortable insole, suitable for all-day wear.", BigDecimal.valueOf(5499), "/derby_shoes.jpg", 10, "Formal_Shoes", "Brand D"));
        productRepository.save(new Product("Monk Strap Shoes", "Premium leather monk strap shoes with a sophisticated double-buckle design, ideal for special occasions.", BigDecimal.valueOf(5999), "/monk_shoes.jpg", 9, "Formal_Shoes", "Brand E"));

// Sports Shoes
        productRepository.save(new Product("Puma Running Shoes", "Lightweight and breathable sports shoes with advanced cushioning for maximum comfort.", BigDecimal.valueOf(3999), "/puma_running.jpg", 10, "Sports_Shoes", "Puma"));
        productRepository.save(new Product("Reebok Training Shoes", "Durable and flexible training shoes designed for intense workouts and gym sessions.", BigDecimal.valueOf(4299), "/reebok_trainers.jpg", 15, "Sports_Shoes", "Reebok"));
        productRepository.save(new Product("Asics Gel Kayano", "High-performance running shoes featuring gel cushioning for enhanced stability and support.", BigDecimal.valueOf(5999), "/asics_gel.jpg", 12, "Sports_Shoes", "Asics"));

// Fruits & Vegetables
        productRepository.save(new Product("Fresh Apples", "Organic red apples, handpicked for freshness and rich in essential vitamins and antioxidants.", BigDecimal.valueOf(299), "/apples.jpg", 50, "Fruits_Vegetables", "Farm Fresh"));
        productRepository.save(new Product("Carrots", "Farm-fresh carrots packed with nutrients and perfect for healthy snacks and cooking.", BigDecimal.valueOf(199), "/carrots.jpg", 40, "Fruits_Vegetables", "Farm Fresh"));
        productRepository.save(new Product("Bananas", "Sweet and naturally ripened bananas, a great source of potassium and energy.", BigDecimal.valueOf(249), "/bananas.jpg", 60, "Fruits_Vegetables", "Farm Fresh"));

// Dairy & Bakery
        productRepository.save(new Product("Milk 1L", "Pure and fresh dairy milk, rich in calcium and protein for strong bones and overall health.", BigDecimal.valueOf(69), "/milk.jpg", 30, "Dairy_Bakery", "DairyCo"));
        productRepository.save(new Product("Bread Loaf", "Whole wheat bread, baked fresh daily for a nutritious and tasty meal.", BigDecimal.valueOf(49), "/bread.jpg", 25, "Dairy_Bakery", "Bakery Fresh"));
        productRepository.save(new Product("Cheese Slices", "Premium cheese slices made from high-quality milk, perfect for sandwiches and burgers.", BigDecimal.valueOf(199), "/cheese.jpg", 20, "Dairy_Bakery", "DairyCo"));

// Snacks & Beverages
        productRepository.save(new Product("Potato Chips", "Crispy and lightly salted potato chips made from farm-fresh potatoes.", BigDecimal.valueOf(99), "/chips.jpg", 20, "Snacks_Beverages", "SnackCo"));
        productRepository.save(new Product("Orange Juice", "100% pure orange juice with no added sugar, packed with Vitamin C for a healthy immune system.", BigDecimal.valueOf(149), "/orange_juice.jpg", 18, "Snacks_Beverages", "JuiceCo"));
        productRepository.save(new Product("Chocolate Bar", "Rich and smooth dark chocolate made with the finest cocoa beans, a perfect treat for chocolate lovers.", BigDecimal.valueOf(199), "/chocolate.jpg", 25, "Snacks_Beverages", "SweetCo"));

// Home & Kitchen
        productRepository.save(new Product("Wooden Dining Table", "Elegant solid wood dining table with a polished finish, perfect for family dinners.", BigDecimal.valueOf(19999), "/dining_table.jpg", 5, "Furniture", "HomeStyle"));
        productRepository.save(new Product("Sofa Set", "Luxury 5-seater sofa with soft cushioning and a modern design, ideal for a cozy living room.", BigDecimal.valueOf(29999), "/sofa.jpg", 4, "Furniture", "FurniLux"));
        productRepository.save(new Product("Bookshelf", "Spacious modern wooden bookshelf with multiple compartments for storing books and decor items.", BigDecimal.valueOf(7999), "/bookshelf.jpg", 6, "Furniture", "DecoLife"));

// Cookware
        productRepository.save(new Product("Non-Stick Pan", "Premium non-stick frying pan with a durable coating for healthy and easy cooking.", BigDecimal.valueOf(1999), "/pan.jpg", 12, "Cookware", "KitchenPro"));
        productRepository.save(new Product("Pressure Cooker", "High-quality 5-liter stainless steel cooker for fast and efficient cooking.", BigDecimal.valueOf(2999), "/cooker.jpg", 10, "Cookware", "KitchenPro"));
        productRepository.save(new Product("Chef Knife Set", "Professional stainless steel knife set with ergonomic handles for precision cutting.", BigDecimal.valueOf(2499), "/knife_set.jpg", 15, "Cookware", "KitchenPro"));

// Skincare
        productRepository.save(new Product("Face Moisturizer", "Lightweight and hydrating skincare cream with natural ingredients for soft and smooth skin.", BigDecimal.valueOf(599), "/moisturizer.jpg", 10, "Skincare", "SkinCareCo"));
        productRepository.save(new Product("Sunscreen SPF 50", "Broad-spectrum sunscreen with SPF 50 to protect your skin from harmful UV rays.", BigDecimal.valueOf(799), "/sunscreen.jpg", 15, "Skincare", "SkinCareCo"));
        productRepository.save(new Product("Face Wash", "Gentle deep-cleansing face wash that removes dirt and oil while keeping skin hydrated.", BigDecimal.valueOf(499), "/facewash.jpg", 12, "Skincare", "SkinCareCo"));

// Fitness Equipment
        productRepository.save(new Product("Treadmill", "Advanced running treadmill with multiple speed settings and shock absorption for a smooth workout.", BigDecimal.valueOf(49999), "/treadmill.jpg", 5, "Fitness_Equipment", "FitTech"));
        productRepository.save(new Product("Dumbbells Set", "Adjustable dumbbell set made from high-quality materials, suitable for strength training at home or the gym.", BigDecimal.valueOf(9999), "/dumbbells.jpg", 12, "Fitness_Equipment", "FitTech"));
        productRepository.save(new Product("Yoga Mat", "Anti-slip yoga mat with extra cushioning for better support during yoga and workout sessions.", BigDecimal.valueOf(999), "/yoga_mat.jpg", 20, "Fitness_Equipment", "FitTech"));

        // Home Decor
        productRepository.save(new Product("Wall Painting", "Abstract modern wall art featuring vibrant colors and premium canvas material. Adds elegance to any living space. Frame included for easy mounting.", BigDecimal.valueOf(2999), "/wall_painting.jpg", 10, "Home_Decor", "DecoStyle"));
        productRepository.save(new Product("Table Lamp", "Wooden table lamp with warm LED lighting. Features an elegant design suitable for bedrooms and offices. Energy-efficient and long-lasting.", BigDecimal.valueOf(1999), "/table_lamp.jpg", 15, "Home_Decor", "DecoStyle"));
        productRepository.save(new Product("Decorative Vase", "Handmade ceramic vase with intricate detailing. Perfect for flowers or as a standalone decor piece. Available in multiple colors and sizes.", BigDecimal.valueOf(999), "/vase.jpg", 20, "Home_Decor", "DecoStyle"));

// Makeup
        productRepository.save(new Product("Lipstick", "Matte finish long-lasting lipstick enriched with moisturizing ingredients. Available in a variety of bold and nude shades. Smudge-proof formula.", BigDecimal.valueOf(599), "/lipstick.jpg", 20, "Makeup", "BeautyGlow"));
        productRepository.save(new Product("Foundation", "Full coverage liquid foundation with a lightweight feel. Blends seamlessly to create a flawless complexion. Suitable for all skin types.", BigDecimal.valueOf(899), "/foundation.jpg", 15, "Makeup", "BeautyGlow"));
        productRepository.save(new Product("Eyeliner", "Waterproof precision eyeliner with a smooth, smudge-proof application. Comes with a fine tip for perfect winged lines. Long-lasting formula.", BigDecimal.valueOf(499), "/eyeliner.jpg", 25, "Makeup", "BeautyGlow"));

// Hair Care
        productRepository.save(new Product("Shampoo", "Organic anti-dandruff shampoo infused with natural extracts to nourish hair and prevent scalp irritation. Free from parabens and sulfates.", BigDecimal.valueOf(699), "/shampoo.jpg", 18, "Hair_Care", "HairNourish"));
        productRepository.save(new Product("Hair Conditioner", "Silky smooth hair conditioner with keratin and argan oil for deep nourishment. Strengthens hair and reduces frizz.", BigDecimal.valueOf(749), "/conditioner.jpg", 15, "Hair_Care", "HairNourish"));
        productRepository.save(new Product("Hair Serum", "Keratin-infused hair serum that provides shine and protects against heat damage. Lightweight, non-greasy formula for all hair types.", BigDecimal.valueOf(999), "/hair_serum.jpg", 10, "Hair_Care", "HairNourish"));

// Supplements
        productRepository.save(new Product("Multivitamin Tablets", "Essential daily vitamins to support overall health and immunity. Contains a blend of vitamins and minerals. 60 tablets per bottle.", BigDecimal.valueOf(1299), "/multivitamin.jpg", 20, "Supplements", "HealthBoost"));
        productRepository.save(new Product("Protein Powder", "High-quality whey protein for muscle gain and recovery. Rich in BCAAs and essential nutrients. Available in chocolate and vanilla flavors.", BigDecimal.valueOf(2499), "/protein_powder.jpg", 15, "Supplements", "HealthBoost"));
        productRepository.save(new Product("Omega-3 Capsules", "Fish oil capsules for heart and brain health. Rich in EPA and DHA. Supports joint health and overall well-being. 90 soft gels per bottle.", BigDecimal.valueOf(1599), "/omega3.jpg", 12, "Supplements", "HealthBoost"));

// Activewear
        productRepository.save(new Product("Running Shorts", "Breathable sports shorts made from moisture-wicking fabric. Designed for comfort and flexibility. Available in multiple sizes and colors.", BigDecimal.valueOf(999), "/running_shorts.jpg", 25, "Activewear", "FitWear"));
        productRepository.save(new Product("Gym T-Shirt", "Quick-dry gym t-shirt made from lightweight, stretchable fabric. Keeps you cool during workouts. Available in various designs.", BigDecimal.valueOf(1199), "/gym_tshirt.jpg", 20, "Activewear", "FitWear"));
        productRepository.save(new Product("Yoga Leggings", "High-waist, stretchable yoga leggings with compression support. Ideal for workouts, yoga, and casual wear. Available in multiple colors.", BigDecimal.valueOf(1499), "/yoga_leggings.jpg", 18, "Activewear", "FitWear"));

// Fiction Books
        productRepository.save(new Product("Harry Potter", "A magical fantasy novel series by J.K. Rowling. Follows the journey of young wizard Harry Potter and his adventures at Hogwarts.", BigDecimal.valueOf(1499), "/harry_potter.jpg", 20, "Fiction", "BookHaven"));
        productRepository.save(new Product("Lord of the Rings", "An epic fantasy novel by J.R.R. Tolkien. Chronicles the journey of Frodo Baggins to destroy the One Ring and defeat Sauron.", BigDecimal.valueOf(1999), "/lord_rings.jpg", 15, "Fiction", "BookHaven"));
        productRepository.save(new Product("To Kill a Mockingbird", "A classic American novel by Harper Lee. Explores themes of racial injustice and moral growth through the eyes of Scout Finch.", BigDecimal.valueOf(899), "/mockingbird.jpg", 18, "Fiction", "BookHaven"));

// Non-Fiction Books
        productRepository.save(new Product("Sapiens", "A brief history of humankind by Yuval Noah Harari. Explores human evolution, culture, and the future of civilization.", BigDecimal.valueOf(1299), "/sapiens.jpg", 20, "Non-Fiction", "BookHaven"));
        productRepository.save(new Product("Atomic Habits", "A self-improvement guide by James Clear. Provides a practical approach to building good habits and breaking bad ones.", BigDecimal.valueOf(999), "/atomic_habits.jpg", 25, "Non-Fiction", "BookHaven"));
        productRepository.save(new Product("The Power of Now", "A spiritual self-improvement book by Eckhart Tolle. Focuses on mindfulness and the importance of living in the present moment.", BigDecimal.valueOf(899), "/power_now.jpg", 15, "Non-Fiction", "BookHaven"));

// Educational Books
        productRepository.save(new Product("Mathematics for Beginners", "A comprehensive guide covering fundamental math concepts. Suitable for students and beginners. Includes exercises and examples.", BigDecimal.valueOf(799), "/math_book.jpg", 30, "Educational", "EduBooks"));
        productRepository.save(new Product("Science Encyclopedia", "A detailed encyclopedia covering various science topics. Includes illustrations and easy-to-understand explanations.", BigDecimal.valueOf(1499), "/science_book.jpg", 20, "Educational", "EduBooks"));
        productRepository.save(new Product("English Grammar Guide", "A complete English grammar book covering rules, tenses, and sentence structure. Ideal for students and professionals.", BigDecimal.valueOf(899), "/grammar_book.jpg", 25, "Educational", "EduBooks"));
// Educational Toys
        productRepository.save(new Product("Building Blocks", "Colorful learning blocks designed to enhance cognitive skills and creativity. Made from high-quality, non-toxic plastic. Includes 50 interlocking pieces for endless fun.", BigDecimal.valueOf(799), "/building_blocks.jpg", 20, "Educational_Toys", "ToyLand"));
        productRepository.save(new Product("Math Learning Kit", "An interactive set with flashcards, counting beads, and arithmetic puzzles to help kids develop mathematical skills. Includes an activity book for guided learning.", BigDecimal.valueOf(1299), "/math_kit.jpg", 15, "Educational_Toys", "ToyLand"));
        productRepository.save(new Product("Science Experiment Kit", "Fun and engaging experiments to introduce kids to science. Includes test tubes, safe chemicals, and a detailed instruction manual for hands-on learning.", BigDecimal.valueOf(1499), "/science_kit.jpg", 10, "Educational_Toys", "ToyLand"));

// Baby Essentials
        productRepository.save(new Product("Baby Diapers", "Ultra-absorbent, breathable, and leak-proof diapers designed for all-day comfort. Dermatologically tested and hypoallergenic.", BigDecimal.valueOf(999), "/diapers.jpg", 30, "Baby_Essentials", "BabyCare"));
        productRepository.save(new Product("Baby Wipes", "Soft, fragrance-free, and gentle wipes enriched with aloe vera and vitamin E to keep your baby's skin moisturized and irritation-free.", BigDecimal.valueOf(499), "/baby_wipes.jpg", 25, "Baby_Essentials", "BabyCare"));
        productRepository.save(new Product("Baby Bottle", "BPA-free, anti-colic feeding bottle with an ergonomic design for easy grip. Features a silicone nipple for a natural feeding experience.", BigDecimal.valueOf(699), "/baby_bottle.jpg", 20, "Baby_Essentials", "BabyCare"));

// Kids Apparel
        productRepository.save(new Product("Cotton T-Shirt", "Soft and breathable cotton t-shirt for kids. Available in multiple colors and sizes, designed for comfort and casual wear.", BigDecimal.valueOf(599), "/kids_tshirt.jpg", 20, "Kids_Apparel", "TinyTrends"));
        productRepository.save(new Product("Denim Jeans", "Durable and stretchable denim jeans with an elastic waistband for a perfect fit. Made from a cotton-blend fabric for added comfort.", BigDecimal.valueOf(899), "/kids_jeans.jpg", 15, "Kids_Apparel", "TinyTrends"));
        productRepository.save(new Product("Winter Jacket", "Warm and stylish winter jacket with fleece lining and a water-resistant outer shell. Available in various colors and sizes.", BigDecimal.valueOf(1499), "/kids_jacket.jpg", 10, "Kids_Apparel", "TinyTrends"));

// Car Accessories
        productRepository.save(new Product("Car Vacuum Cleaner", "Compact and powerful vacuum cleaner with a HEPA filter and a 12V adapter. Comes with multiple nozzles for deep cleaning.", BigDecimal.valueOf(2499), "/car_vacuum.jpg", 10, "Car_Accessories", "AutoCare"));
        productRepository.save(new Product("Seat Covers", "Premium leather seat covers designed for comfort and durability. Water-resistant and easy to install with universal fitment.", BigDecimal.valueOf(3499), "/seat_covers.jpg", 8, "Car_Accessories", "AutoCare"));
        productRepository.save(new Product("Phone Mount", "Adjustable dashboard phone mount with a strong suction cup and 360-degree rotation. Compatible with most smartphones.", BigDecimal.valueOf(799), "/phone_mount.jpg", 15, "Car_Accessories", "AutoCare"));

// Bike Accessories
        productRepository.save(new Product("Bike Gloves", "Protective riding gloves made with breathable fabric and anti-slip padding for a comfortable grip. Touchscreen-compatible fingertips.", BigDecimal.valueOf(1299), "/bike_gloves.jpg", 20, "Bike_Accessories", "MotoGear"));
        productRepository.save(new Product("Helmet", "Safety-certified full-face helmet with an impact-resistant shell and cushioned interior for maximum protection.", BigDecimal.valueOf(2999), "/helmet.jpg", 12, "Bike_Accessories", "MotoGear"));
        productRepository.save(new Product("Bike Cover", "Waterproof and dustproof bike cover made from durable polyester material. UV-resistant and protects against harsh weather conditions.", BigDecimal.valueOf(999), "/bike_cover.jpg", 18, "Bike_Accessories", "MotoGear"));

// Tools & Gadgets
        productRepository.save(new Product("Cordless Drill", "Rechargeable cordless drill with variable speed settings and an ergonomic grip. Includes a set of drill bits and a fast-charging battery.", BigDecimal.valueOf(3999), "/cordless_drill.jpg", 10, "Tools_Gadgets", "ToolMaster"));
        productRepository.save(new Product("Screwdriver Set", "Multi-functional screwdriver set with 24 interchangeable heads. Made from high-quality stainless steel for durability.", BigDecimal.valueOf(999), "/screwdriver_set.jpg", 20, "Tools_Gadgets", "ToolMaster"));
        productRepository.save(new Product("LED Work Light", "Super-bright LED work light with adjustable brightness levels. Battery-operated with a rechargeable lithium-ion battery.", BigDecimal.valueOf(1499), "/led_work_light.jpg", 15, "Tools_Gadgets", "ToolMaster"));


    }
}
