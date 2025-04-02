package com.example.sns.repository.bank2;

import com.example.sns.model.bank2.BankClientsModel2;
import com.example.sns.projection.bank2.BankClientsProjection2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankClientsRepository2 extends JpaRepository<BankClientsModel2, Long> {

    List<BankClientsProjection2> findAllProjectedBy();
}
