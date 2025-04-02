package com.example.sns.model.transac;

import com.example.sns.utils.compositekey.OrderItemId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_lines")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderLinesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "product_id")
    private int productId;

//    @EmbeddedId
//    private OrderItemId orderItemId;

    @Column(name = "quantity")
    private int quantity;
}
