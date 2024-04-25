package com.example.demo.DAO;

import com.example.demo.Repository.ProductRepository;
import com.example.demo.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDAOService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    // Use custom query methods
    public List<Product> searchProductsByName(String name) {
        return productRepository.findByProductNameContaining(name);
    }
}
