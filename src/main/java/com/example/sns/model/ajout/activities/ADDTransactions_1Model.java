package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "transactions_1")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDTransactions_1Model {
    @Id
    @Column(name = "transaction_id")
    private String Id;

    @Column(name = "transaction_datetime")
    private Timestamp transactionDatetime;

    @Column(name = "debit_account_id")
    private int debitAccountId;

    @Column(name = "credit_bank_name")
    private String creditBankName;

    @Column(name = "authentication_type")
    private String authenticationType;

    @Column(name = "transferred_amount")
    private double transferredAmount;

    @Column(name = "new_debit_account_state")
    private String newDebitAccountState;

    @Column(name = "age_at_request")
    private int ageAtRequest;
}
