package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "external_transactions_2")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDExternal_transactions_2Model {
    @Id
    @Column(name = "external_transaction_id")
    private Long externalTransactionId;

    @Column(name = "local_transaction_id", nullable = false)
    private int localTransactionId;

    @Column(name = "status", nullable = false)
    private String status;
}
