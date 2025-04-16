package com.example.sns.repository.recup.bank2;

import com.example.sns.model.recup.bank2.TransactionsModel2;
import com.example.sns.projection.bank2.TransactionsProjection2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionsRepository2 extends JpaRepository<TransactionsModel2, Long> {

    List<TransactionsProjection2> findAllProjectedBy();
}
