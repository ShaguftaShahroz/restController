package com.example.demo.DAO;

import com.example.demo.Repository.GtinRepository;
import com.example.demo.entities.Gtin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GtinService {
    @Autowired
    private GtinRepository gtinRepository;

    // Save a new GTIN
    public Gtin saveGtin(Gtin gtin) {
        return gtinRepository.save(gtin);
    }

    // Retrieve all GTINs with positive available quantity in batches
    public List<Gtin> findGtinsWithPositiveQuantity() {
        return gtinRepository.findGtinsWithPositiveQuantity();
    }
    public List<Gtin> findGtinsWithNegativeQuantity() {
        return gtinRepository.findGtinsWithNegativeQuantity();
    }
}