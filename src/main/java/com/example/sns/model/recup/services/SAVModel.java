package com.example.sns.model.recup.services;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

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
    private Long id;

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

    @Column(name = "description")
    private String description;
}
