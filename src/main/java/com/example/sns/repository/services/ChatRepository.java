package com.example.sns.repository.services;

import com.example.sns.model.services.ChatModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatRepository extends JpaRepository<ChatModel, Long> {
    List<ChatModel> findAllProjectedBy();
}
