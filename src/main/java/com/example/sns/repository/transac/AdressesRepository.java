package com.example.sns.repository.transac;

import com.example.sns.model.transac.AdressesModel;
import com.example.sns.projection.transac.AdressesProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdressesRepository extends JpaRepository<AdressesModel, Long> {

    List<AdressesProjection> findAllProjectedBy();
}
