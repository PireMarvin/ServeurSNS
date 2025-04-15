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
    private int transaction_id;

    @Column(name = "transaction_datetime", nullable = false)
    private Date transaction_datetime;

    @Column(name = "debit_account_id", nullable = false)
    private int debit_account_id;

    @Column(name = "credit_bank_name", nullable = false)
    private String credit_bank_name;

    @Column(name = "authentication_type", nullable = false)
    private String authentication_type;

    @Column(name = "transferred_amount", nullable = false)
    private double transferred_amount;

    @Column(name = "new_debit_account_state", nullable = false)
    private double new_debit_account_state;

    @Column(name = "age_at_request")
    private int age_at_request;
}
