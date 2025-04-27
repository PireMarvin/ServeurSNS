package com.example.sns.model.recup.bank2;

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
    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "client_id", nullable = false)
    private int clientId;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "balance", nullable = false)
    private double balance;
}
