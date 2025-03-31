package com.example.sns.model.transac;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "orders")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "client_id")
    private int client_id;

    @Column(name = "order_date")
    private Date order_date;

    @Column(name = "order_time")
    private Timestamp order_time;

    @Column(name = "total")
    private double total;

    @Column(name = "status")
    private String status;

    @Column(name = "bank_name")
    private String bank_name;

    @Column(name = "tracking_id")
    private String tracking_id;

    @Column(name = "address_id")
    private int address_id;
}
