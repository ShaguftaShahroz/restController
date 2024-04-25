package com.example.demo.Controllers;

import com.example.demo.DAO.BatchService;
import com.example.demo.entities.Batch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/batches")
public class BatchController {
    @Autowired
    private BatchService batchService;

    // POST endpoint to create a batch
    @PostMapping
    public ResponseEntity<Batch> createBatch(@RequestBody Batch batch) {
        return ResponseEntity.ok(batchService.saveBatch(batch));
    }

    // GET endpoint to fetch the latest batch with non-positive available quantity
//    @GetMapping("/latest-non-positive")
//    public ResponseEntity<Batch> getLatestBatchWithNonPositiveQuantity() {
//        Batch batch = batchService.findLatestNonPositiveBatch();
//        if (batch == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(batch);
//    }
}
