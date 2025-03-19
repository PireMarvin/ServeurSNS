package com.example.sns.repository.bank2;

import com.example.sns.model.bank2.ExternalTransactionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExternalTransactionsRepository extends JpaRepository<ExternalTransactionsModel, Long> {
}
