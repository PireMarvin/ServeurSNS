package com.example.sns.repository.services;

import com.example.sns.model.services.ClientsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<ClientsModel, Long> {
}
