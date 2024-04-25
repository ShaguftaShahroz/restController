package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "batches")
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer mrp;  // Maximum Retail Price

    @Column(nullable = false)
    private Integer sp;  // Selling Price

    @Column(nullable = false)
    private Integer purchasePrice;

    @Column(nullable = false)
    private Integer availableQuantity;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date inwardedOn;  // Date when the batch was received

    // Constructors, getters, and setters
    public Batch() {}

    public Batch(Integer mrp, Integer sp, Integer purchasePrice, Integer availableQuantity, Date inwardedOn) {
        this.mrp = mrp;
        this.sp = sp;
        this.purchasePrice = purchasePrice;
        this.availableQuantity = availableQuantity;
        this.inwardedOn = inwardedOn;
    }

    // Standard getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMrp() {
        return mrp;
    }

    public void setMrp(Integer mrp) {
        this.mrp = mrp;
    }

    public Integer getSp() {
        return sp;
    }

    public void setSp(Integer sp) {
        this.sp = sp;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Date getInwardedOn() {
        return inwardedOn;
    }

    public void setInwardedOn(Date inwardedOn) {
        this.inwardedOn = inwardedOn;
    }
}
