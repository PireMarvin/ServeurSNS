package com.example.sns.repository.services;

import com.example.sns.model.services.ClientsModel;
import com.example.sns.projection.bank1.ClientsProjection;
import com.example.sns.projection.bank1.TransactionsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientsRepository extends JpaRepository<ClientsModel, Long> {

    List<ClientsProjection> findAllProjectedBy();
}
