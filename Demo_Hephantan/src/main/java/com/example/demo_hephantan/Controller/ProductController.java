package com.example.demo_hephantan.Controller;

import com.example.demo_hephantan.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/hpt/db-service/products")
public class ProductController {
    static List<Product> products = new ArrayList<>();
    static {

        Product product = new Product(1, "Laptop", 12.5F);
        products.add(product);
    }
    @GetMapping()
    public ResponseEntity<List<Product>> getAllProduct(){
        return ResponseEntity.ok(products);
    }
}
