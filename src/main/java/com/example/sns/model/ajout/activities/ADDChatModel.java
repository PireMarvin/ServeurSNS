package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "char")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDChatModel {
    @Id
    private int ID;

    @Column(name = "sender_id")
    private int senderId;

    @Column(name = "message")
    private String message;
}
