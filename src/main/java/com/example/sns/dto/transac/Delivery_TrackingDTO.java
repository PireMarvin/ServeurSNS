package com.example.sns.dto.transac;

import lombok.*;

import java.sql.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Delivery_TrackingDTO {
    private int ID;
    private int order_id;
    private String tracking_number;
    private Date shipment_date;
    private Date estimate_delivery_date;
    private int address_id;
}
