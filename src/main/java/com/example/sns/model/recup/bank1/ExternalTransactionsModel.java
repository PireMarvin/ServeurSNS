package com.example.sns.model.recup.bank1;

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
    @Column(name = "external_transaction_id")
    private Long externalTransactionId;

    @Column(name = "local_transaction_id", nullable = false)
    private int localTransactionId;

    @Column(name = "status", nullable = false)
    private String status;
}
