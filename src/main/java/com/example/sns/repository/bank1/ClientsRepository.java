package com.example.sns.repository.bank1;

import com.example.sns.model.bank1.ClientsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<ClientsModel, Long> {
}
