package com.example.demo.DAO;

import com.example.demo.Repository.BatchRepository;
import com.example.demo.entities.Batch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchService {
    @Autowired
    private BatchRepository batchRepository;

    // Save a new batch
    public Batch saveBatch(Batch batch) {
        return batchRepository.save(batch);
    }

    // Retrieve the latest batch with non-positive available quantity
//    public Batch findLatestNonPositiveBatch() {
//        List<Batch> batches = batchRepository.findLatestNonPositiveBatch();
//        if (!batches.isEmpty()) {
//            return batches.get(0); // Assuming the list is ordered by date in descending order
//        }
//        return null;
//    }
}
