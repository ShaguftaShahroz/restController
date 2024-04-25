package com.example.demo.Controllers;

import com.example.demo.DAO.GtinService;
import com.example.demo.entities.Gtin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/gtins")
public class GtinController {
    @Autowired
    private GtinService gtinService;

    // POST endpoint to create a GTIN
    @PostMapping
    public ResponseEntity<Gtin> createGtin(@RequestBody Gtin gtin) {
        return ResponseEntity.ok(gtinService.saveGtin(gtin));
    }

    // GET endpoint to fetch all GTINs with positive available batch quantities
    @GetMapping("/positive-quantity")
    public ResponseEntity<List<Gtin>> getGtinsWithPositiveQuantity() {
        List<Gtin> gtins = gtinService.findGtinsWithPositiveQuantity();
        if (gtins.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(gtins);
    }
    @GetMapping("/required-gtins")
    public ResponseEntity<List<Gtin>> getRequiredGtins() {
        List<Gtin> gtins = gtinService.findGtinsWithPositiveQuantity();
        if(gtinService.findGtinsWithNegativeQuantity().size()>0) {
            gtins.add(gtinService.findGtinsWithNegativeQuantity().get(0));
        }

        if (gtins.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(gtins);
    }
}
