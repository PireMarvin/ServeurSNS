package com.example.sns.model.bank1;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AccountsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private int account_id;

    @Column(name = "client_id", nullable = false)
    private int client_id;

    @Column(name = "account_number")
    private String account_number;

    @Column(name = "balance", nullable = false)
    private double balance;
}
