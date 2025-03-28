package com.example.sns.model.bank2;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "external_transactions")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExternalTransactionsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int external_transaction_id;

    @Column(name = "local_transaction_id", nullable = false)
    private int local_transaction_id;

    @Column(name = "status", nullable = false)
    private String status;
}
