package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "orders")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDOrdersModel {
    @Id
    private Long ID;

    @Column(name = "client_id")
    private int clientId;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "order_time")
    private Timestamp orderTime;

    @Column(name = "total")
    private double total;

    @Column(name = "status")
    private String status;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "tracking_id")
    private String trackingId;

    @Column(name = "address_id")
    private int addressId;
}
