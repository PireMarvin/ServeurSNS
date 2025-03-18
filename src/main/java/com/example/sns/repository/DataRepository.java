package com.example.sns.repository;

import com.example.sns.model.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<DataModel, Long> {}