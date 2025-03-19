package com.example.sns.repository.services;

import com.example.sns.model.services.StocksModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StocksRepository extends JpaRepository<StocksModel, Long> {
}
