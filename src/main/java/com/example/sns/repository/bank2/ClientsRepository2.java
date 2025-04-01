package com.example.sns.repository.bank2;

import com.example.sns.model.bank2.ClientsModel2;
import com.example.sns.projection.bank2.ClientsProjection2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientsRepository2 extends JpaRepository<ClientsModel2, Long> {

    List<ClientsProjection2> findAllProjectedBy();
}
