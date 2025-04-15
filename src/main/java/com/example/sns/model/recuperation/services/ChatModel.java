package com.example.sns.model.recuperation.services;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "chat")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "sender_id")
    private int senderId;

    @Column(name = "reveiver_id")
    private int reveiverId;

    @Column(name = "message", nullable = false)
    private String message;

    @Column(name = "sent_at")
    private Date sentAt;

    @Column(name = "read_status")
    private boolean readStatus;
}
