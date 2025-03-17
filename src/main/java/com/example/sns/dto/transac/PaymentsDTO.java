package com.example.sns.dto.transac;

import lombok.*;

import java.sql.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentsDTO {
    private int ID;
    private int order_id;
    private float amount;
    private String status;
    private Date payement_date;
    private String payment_method;
}
