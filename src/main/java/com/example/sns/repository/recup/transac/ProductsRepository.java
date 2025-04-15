package com.example.sns.repository.recup.transac;

import com.example.sns.model.recuperation.transac.ProductsModel;
import com.example.sns.projection.transac.ProductsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<ProductsModel, Long> {

    List<ProductsProjection> findAllProjectedBy();
}
