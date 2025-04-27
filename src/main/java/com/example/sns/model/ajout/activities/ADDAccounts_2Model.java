package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "accounts_2")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDAccounts_2Model {
    @Id
    @Column(name = "account_id", nullable = false)
    private int accountsId;

    @Column(name = "client_id", nullable = false)
    private int clientId;

    @Column(name = "balance", nullable = false)
    private double balance;

}
