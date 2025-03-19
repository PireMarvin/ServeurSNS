package com.example.sns.repository.services;

import com.example.sns.model.services.AdressesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressesRepository extends JpaRepository<AdressesModel, Long> {
}
