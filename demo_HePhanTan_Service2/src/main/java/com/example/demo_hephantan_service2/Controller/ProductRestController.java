package com.example.demo_hephantan_service2.Controller;

import com.example.demo_hephantan_service2.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hpt/service2/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductRestController {
    @Autowired
    ProductService productService;
    @GetMapping()
    public ResponseEntity<String> getAllProduct(){
        return ResponseEntity.ok(productService.getAllProduct());
    }
}
