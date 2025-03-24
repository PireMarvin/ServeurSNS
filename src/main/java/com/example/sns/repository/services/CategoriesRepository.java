package com.example.sns.repository.services;

import com.example.sns.model.services.CategoriesModel;
import com.example.sns.projection.bank1.TransactionsProjection;
import com.example.sns.projection.services.CategoriesProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriesRepository extends JpaRepository<CategoriesModel, Long> {

    List<CategoriesProjection> findAllProjectedBy();
}
