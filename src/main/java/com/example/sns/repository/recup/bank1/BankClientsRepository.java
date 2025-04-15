package com.example.sns.repository.recup.bank1;

import com.example.sns.model.recuperation.bank1.BankClientsModel;
import com.example.sns.projection.bank1.BankClientsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankClientsRepository extends JpaRepository<BankClientsModel, Long> {

    List<BankClientsProjection> findAllProjectedBy();
}
