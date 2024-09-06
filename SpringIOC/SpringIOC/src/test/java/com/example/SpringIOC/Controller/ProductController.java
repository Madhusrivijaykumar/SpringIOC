package com.example.SpringIOC.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {




        @Autowired
        private ProductService productService;

        @GetMapping("/")
        public String home() {
            return "index";
        }

        @GetMapping("/add-product")
        public String showAddProductForm(Model model) {
            model.addAttribute("product", new Product());
            return "add-product";
        }

        @PostMapping("/add-product")
        public <Product> String addProduct(@ModelAttribute Product product) {
            productService.addProduct(product);
            return "redirect:/";
        }

        @GetMapping("/display-products")
        public <Product> String displayProducts(Model model) {
            List<Product> products = productService.getAllProducts();
            model.addAttribute("products", products);
            return "display-products";
        }
    }

}
