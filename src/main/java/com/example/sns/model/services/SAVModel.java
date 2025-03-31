package com.example.sns.model.services;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "sav")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SAVModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "request_type", nullable = false)
    private String requestType;

    @Column(name = "created_at")
    private Date createdAt; //currentdate

    @Column(name = "updated_at")
    private Date updatedAt;
}
