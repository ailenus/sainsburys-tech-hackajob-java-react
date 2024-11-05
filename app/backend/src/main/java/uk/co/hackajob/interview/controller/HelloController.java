package uk.co.hackajob.interview.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import uk.co.hackajob.interview.service.ProductService;
import uk.co.hackajob.interview.entity.Product;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @GetMapping("/h/p/i/{uid}")
    public Product check(@PathVariable String uid) {
        ProductService productService = new ProductService();

        return productService.get(uid);
    }
}
