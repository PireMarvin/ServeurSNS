package com.example.sns.repository.bank2;

import com.example.sns.model.bank2.ExternalTransactionsModel2;
import com.example.sns.projection.bank1.ExternalTransactionsProjection;
import com.example.sns.projection.bank2.ExternalTransactionsProjection2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExternalTransactionsRepository2 extends JpaRepository<ExternalTransactionsModel2, Long> {

    List<ExternalTransactionsProjection2> findAllProjectedBy();
}
