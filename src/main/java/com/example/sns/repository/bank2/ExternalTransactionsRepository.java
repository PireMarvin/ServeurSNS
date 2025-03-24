package com.example.sns.repository.bank2;

import com.example.sns.model.bank2.ExternalTransactionsModel;
import com.example.sns.projection.bank1.ExternalTransactionsProjection;
import com.example.sns.projection.bank1.TransactionsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExternalTransactionsRepository extends JpaRepository<ExternalTransactionsModel, Long> {

    List<ExternalTransactionsProjection> findAllProjectedBy();
}
