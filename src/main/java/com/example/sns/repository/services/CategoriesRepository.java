package com.example.sns.repository.services;

import com.example.sns.model.services.CategoriesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<CategoriesModel, Long> {
}
