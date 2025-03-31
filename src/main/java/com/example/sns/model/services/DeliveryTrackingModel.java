package com.example.sns.model.services;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "delivery_tracking")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryTrackingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_id", nullable = false)
    private int orderId;

    @Column(name = "tracking_number", nullable = false, unique = true)
    private String trackingNumber;

    @Column(name = "shipment_date")
    private LocalDate shipmentDate;

    @Column(name = "estimate_delivery_date")
    private LocalDate estimateDeliveryDate;

    @Column(name = "address_id", nullable = false)
    private int addressId;
}
