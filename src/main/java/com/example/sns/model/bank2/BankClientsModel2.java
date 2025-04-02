package com.example.sns.model.bank2;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "clients")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class BankClientsModel2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private int client_id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "client_number", nullable = false)
    private String client_number;

    @Column(name = "account_number", nullable = false)
    private String account_number;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "birth_date", nullable = false)
    private Date birth_date;

    @Column(name = "marital_status", nullable = false)
    private String marital_status;

    @Column(name = "monthly_income")
    private double monthly_income;

    @Column(name = "bank_name")
    private String bank_name;
}
