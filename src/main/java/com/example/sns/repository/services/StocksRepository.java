package com.example.sns.repository.services;

import com.example.sns.model.services.StocksModel;
import com.example.sns.projection.bank1.TransactionsProjection;
import com.example.sns.projection.services.StocksProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StocksRepository extends JpaRepository<StocksModel, Long> {

    List<StocksProjection> findAllProjectedBy();
}
