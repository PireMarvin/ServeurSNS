package com.example.sns.repository.bank1;

import com.example.sns.model.bank1.ClientsModel;
import com.example.sns.projection.bank1.ClientsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientsRepository extends JpaRepository<ClientsModel, Long> {

    List<ClientsProjection> findAllProjectedBy();
}
