package com.example.demo.Controllers;

import com.example.demo.DAO.ProductDAOService;
import com.example.demo.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductDAOService productDAOService;

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product savedProduct = productDAOService.saveProduct(product);
        return ResponseEntity.ok(savedProduct);
    }
    @GetMapping("/products/findAll")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productDAOService.getAllProducts();
        return ResponseEntity.ok(products);
    }

}
