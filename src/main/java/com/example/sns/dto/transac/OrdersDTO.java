package com.example.sns.dto.transac;

import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDTO {
    private int ID;
    private int client_id;
    private Date order_date;
    private Timestamp order_time;
    private float total;
    private String status;
    private String bank_name;
    private String tracking_id;
}
