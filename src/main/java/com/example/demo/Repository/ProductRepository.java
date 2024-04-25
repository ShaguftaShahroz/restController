package com.example.demo.Repository;

import com.example.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Find products by name
    List<Product> findByProductName(String productName);

    // Find products by a part of the name using a Like query
    List<Product> findByProductNameContaining(String productNameSnippet);

    // Find products created after a certain date
    List<Product> findByCreatedOnAfter(Date date);
}
