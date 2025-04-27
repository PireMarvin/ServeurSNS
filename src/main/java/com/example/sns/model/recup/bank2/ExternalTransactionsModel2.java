package com.example.sns.model.recup.bank2;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "external_transactions")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExternalTransactionsModel2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "external_transaction_id")
    private Long externalTransactionId;

    @Column(name = "local_transaction_id", nullable = false)
    private int localTransactionId;

    @Column(name = "status", nullable = false)
    private String status;
}
