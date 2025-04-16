package com.example.sns.repository.recup.transac;

import com.example.sns.model.recup.transac.ClientsModel;
import com.example.sns.projection.transac.ClientsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientsRepository extends JpaRepository<ClientsModel, Long> {

    List<ClientsProjection> findAllProjectedBy();
}
