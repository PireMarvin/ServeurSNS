package com.example.sns.model.bank1;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "external_transactions")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExternalTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int external_transaction_id;

    @Column(name = "local_transaction_id", nullable = false)
    private int local_transaction_id;

    @Column(name = "status", nullable = false)
    private String status;
}
