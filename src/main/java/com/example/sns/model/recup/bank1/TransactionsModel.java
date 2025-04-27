package com.example.sns.model.recup.bank1;

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

public class TransactionsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "transaction_datetime")
    private Timestamp transactionDatetime;

    @Column(name = "debit_account_id", nullable = false)
    private int debitAccountId;

    @Column(name = "credit_bank_name", nullable = false)
    private String creditBankName;

    @Column(name = "credit_account_number", nullable = false)
    private String creditAccountNumber;

    @Column(name = "merchant_name", nullable = false)
    private String merchantName;

    @Column(name = "authentication_type", nullable = false)
    private String authenticationType;

    @Column(name = "transferred_amount", nullable = false)
    private double transferredAmount;

    @Column(name = "transaction_note", nullable = false)
    private String transactionNote;

    @Column(name = "new_debit_account_state", nullable = false)
    private String newDebitAccountState;

    @Column(name = "age_at_request")
    private int ageAtRequest;

}