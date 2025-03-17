package com.example.sns.dto.transac;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order_LinesDTO {
    private int ID;
    private int order_id;
    private int product_id;
    private int quantity;
}
