package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "accounts_1")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDAccounts_1Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accounts_id")
    private int accounts_id;

    @Column(name = "client_id", nullable = false)
    private int client_id;

    @Column(name = "balance", nullable = false)
    private double balance;
}
