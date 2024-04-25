package com.example.demo.Repository;

import com.example.demo.entities.Gtin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GtinRepository extends JpaRepository<Gtin, Long> {

    @Query("SELECT g from Gtin g join Batch b on g.batchId=b.id where b.availableQuantity>0")
    List<Gtin> findGtinsWithPositiveQuantity();


    @Query("SELECT g from Gtin g join Batch b on g.batchId=b.id where b.availableQuantity<=0 order by b.inwardedOn")
    List<Gtin> findGtinsWithNegativeQuantity();
}