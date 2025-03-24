package com.example.sns.repository.services;

import com.example.sns.model.services.AdressesModel;
import com.example.sns.projection.bank1.TransactionsProjection;
import com.example.sns.projection.services.AdressesProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdressesRepository extends JpaRepository<AdressesModel, Long> {

    List<AdressesProjection> findAllProjectedBy();
}
