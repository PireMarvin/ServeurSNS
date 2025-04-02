package com.example.sns.repository.bank1;

import com.example.sns.model.bank1.ExternalTransactionsModel;
import com.example.sns.projection.bank1.ExternalTransactionsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExternalTransactionsRepository extends JpaRepository<ExternalTransactionsModel, Long> {

    List<ExternalTransactionsProjection> findAllProjectedBy();
}
