package com.example.sns.repository.bank2;

import com.example.sns.model.bank2.ClientsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<ClientsModel, Long> {
}
