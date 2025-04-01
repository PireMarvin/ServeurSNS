package com.example.sns.model.bank2;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class TransactionsModel2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transaction_id;

    @Column(name = "transaction_datetime")
    private Timestamp transaction_datetime;

    @Column(name = "debit_account_id", nullable = false)
    private int debit_account_id;

    @Column(name = "credit_bank_name", nullable = false)
    private String credit_bank_name;

    @Column(name = "credit_account_number", nullable = false)
    private String credit_account_number;

    @Column(name = "merchant_name", nullable = false)
    private String merchant_name;

    @Column(name = "authentication_type", nullable = false)
    private String authentication_type;

    @Column(name = "transferred_amount", nullable = false)
    private float transferred_amount;

    @Column(name = "transaction_note", nullable = false)
    private String transaction_note;

    @Column(name = "new_debit_account_state", nullable = false)
    private String new_debit_account_state;

    @Column(name = "age_at_request", nullable = false)
    private int age_at_request;
}
