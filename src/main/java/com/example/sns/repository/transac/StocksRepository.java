package com.example.sns.repository.transac;

import com.example.sns.model.transac.StocksModel;
import com.example.sns.projection.transac.StocksProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StocksRepository extends JpaRepository<StocksModel, Long> {

    List<StocksProjection> findAllProjectedBy();
}
