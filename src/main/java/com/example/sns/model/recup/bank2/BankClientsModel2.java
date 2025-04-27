package com.example.sns.model.recup.bank2;

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
    private Long clientId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "client_number", nullable = false)
    private String clientNumber;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "birth_date", nullable = false)
    private Date birthDate;

    @Column(name = "marital_status", nullable = false)
    private String maritalStatus;

    @Column(name = "monthly_income")
    private double monthlyIncome;

    @Column(name = "bank_name")
    private String bankName;
}
