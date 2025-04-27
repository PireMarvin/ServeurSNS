package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "payments")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDPaymentsModel {
    @Id
    private Long ID;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "status")
    private String status;

    @Column(name = "payement_date")
    private Date payementDate;

    @Column(name = "payment_method")
    private String paymentMethod;
}
