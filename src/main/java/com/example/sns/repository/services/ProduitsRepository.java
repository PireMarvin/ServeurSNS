package com.example.sns.repository.services;

import com.example.sns.model.services.ProduitsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitsRepository extends JpaRepository<ProduitsModel, Long> {
}
