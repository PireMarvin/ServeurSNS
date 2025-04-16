package com.example.sns.model.ajout.activities;

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
public class ADDSavModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "request_type", nullable = false)
    private String requestType;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;

}
