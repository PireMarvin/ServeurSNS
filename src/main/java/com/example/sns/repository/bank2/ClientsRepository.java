package com.example.sns.repository.bank2;

import com.example.sns.model.bank2.ClientsModel;
import com.example.sns.projection.bank1.TransactionsProjection;
import com.example.sns.projection.bank2.ClientsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientsRepository extends JpaRepository<ClientsModel, Long> {

    List<ClientsProjection> findAllProjectedBy();
}
