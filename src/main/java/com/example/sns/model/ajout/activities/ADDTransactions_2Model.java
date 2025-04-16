package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "transaction_2")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDTransactions_2Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private int transactionId;

    @Column(name = "transaction_datetime", nullable = false)
    private Date transactionDatetime;

    @Column(name = "debit_account_id", nullable = false)
    private int debitAccountId;

    @Column(name = "credit_bank_name", nullable = false)
    private String creditBankName;

    @Column(name = "authentication_type", nullable = false)
    private String authenticationType;

    @Column(name = "transferred_amount", nullable = false)
    private double transferredAmount;

    @Column(name = "new_debit_account_state", nullable = false)
    private double newDebitAccountState;

    @Column(name = "age_at_request")
    private int ageAtRequest;
}
