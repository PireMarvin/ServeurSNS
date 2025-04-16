package com.example.sns.repository.recup.services;

import com.example.sns.model.recup.services.SAVModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SAVRepository extends JpaRepository<SAVModel, Long> {

    List<SAVModel> findAllProjectedBy();
}
