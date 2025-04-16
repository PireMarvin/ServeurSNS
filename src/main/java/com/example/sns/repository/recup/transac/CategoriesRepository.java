package com.example.sns.repository.recup.transac;

import com.example.sns.model.recup.transac.CategoriesModel;
import com.example.sns.projection.transac.CategoriesProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriesRepository extends JpaRepository<CategoriesModel, Long> {

    List<CategoriesProjection> findAllProjectedBy();
}
