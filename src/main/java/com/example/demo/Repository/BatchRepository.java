package com.example.demo.Repository;

import com.example.demo.entities.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatchRepository extends JpaRepository<Batch, Long> {
    // Custom query to find the latest batch with non-positive available quantity
//    @Query("SELECT g.* FROM gtins g join batches b on g.batchId=b.id WHERE b.availableQuantity <= 0 ORDER BY b.inwardedOn DESC")
//    List<Batch> findLatestNonPositiveBatch();
}