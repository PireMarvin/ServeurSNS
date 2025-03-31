package com.example.sns.repository.services;

import com.example.sns.model.services.CommentsModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentsRepository extends JpaRepository<CommentsModel, Long> {
    List<CommentsModel> findAllProjectedBy();
}
