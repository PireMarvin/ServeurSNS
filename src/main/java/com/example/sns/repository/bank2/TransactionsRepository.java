package com.example.sns.repository.bank2;

import com.example.sns.model.bank2.TransactionsModel;
import com.example.sns.projection.bank1.TransactionsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionsRepository extends JpaRepository<TransactionsModel, Long> {

    List<TransactionsProjection> findAllProjectedBy();
}
