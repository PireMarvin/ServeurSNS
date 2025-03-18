package com.example.sns.model.transac;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order_LinesMODEL {
    private int ID;
    private int order_id;
    private int product_id;
    private int quantity;
}
