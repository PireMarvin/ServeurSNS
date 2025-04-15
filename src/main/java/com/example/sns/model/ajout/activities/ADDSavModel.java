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
    private int customer_id;

    @Column(name = "order_id")
    private int order_id;

    @Column(name = "request_type", nullable = false)
    private String request_type;

    @Column(name = "created_at", nullable = false)
    private Date created_at;

    @Column(name = "updated_at", nullable = false)
    private Date updated_at;

}
