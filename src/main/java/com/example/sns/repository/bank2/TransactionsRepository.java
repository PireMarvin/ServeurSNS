package com.example.sns.repository.bank2;

import com.example.sns.model.bank2.TransactionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<TransactionsModel, Long> {
}
