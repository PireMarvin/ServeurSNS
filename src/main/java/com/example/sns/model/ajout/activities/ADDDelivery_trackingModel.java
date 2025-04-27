package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "delivery_tracking")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDDelivery_trackingModel {
    @Id
    private int ID;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "shipment_date", nullable = false)
    private Date shipmentDate;

    @Column(name = "estimate_delivery_date", nullable = false)
    private Date estimateDeliveryDate;

    @Column(name = "address_id")
    private int addressId;

}
