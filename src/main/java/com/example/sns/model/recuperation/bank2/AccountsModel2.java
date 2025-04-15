package com.example.sns.model.recuperation.bank2;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AccountsModel2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accounts_id")
    private int account_id;

    @Column(name = "client_id", nullable = false)
    private int client_id;

    @Column(name = "account_number")
    private String account_number;

    @Column(name = "balance", nullable = false)
    private double balance;
}
