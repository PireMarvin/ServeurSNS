package com.example.sns.repository.transac;

import com.example.sns.model.transac.ProduitsModel;
import com.example.sns.projection.transac.ProduitsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitsRepository extends JpaRepository<ProduitsModel, Long> {

    List<ProduitsProjection> findAllProjectedBy();
}
