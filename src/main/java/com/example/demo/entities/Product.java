package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 250)
    private String productName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date createdOn;

    // Constructors
    public Product() {
    }

    public Product(String productName, Date createdOn) {
        this.productName = productName;
        this.createdOn = createdOn;
    }

    // Getter and setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    // ToString method for debugging and logging purposes
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
