package com.example.sns.model.recup.transac;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.sql.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders", schema = "bdtransac")
public class OrdersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_id", nullable = false)
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

    @Column(name = "livreur_id")
    private int livreurId;
}
