package com.example.sns.repository.services;

import com.example.sns.model.services.ProduitsModel;
import com.example.sns.projection.bank1.TransactionsProjection;
import com.example.sns.projection.services.ProduitsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitsRepository extends JpaRepository<ProduitsModel, Long> {

    List<ProduitsProjection> findAllProjectedBy();
}
