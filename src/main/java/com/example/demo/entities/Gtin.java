package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "gtins")
public class Gtin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String gtin;

    @Column(nullable = false)
    private Long productId;  // Assuming it links to a Product entity

    @Column(nullable = false)
    private Long batchId;  // Assuming it links to a Product entity

    // Constructors, getters, and setters
    public Gtin() {}

    public Gtin(String gtin, Long productId) {
        this.gtin = gtin;
        this.productId = productId;
    }

    // Standard getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }
}