package com.renzo.music.domain.order.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GenericGenerator(name = "orderIdGenerator", strategy = "com.renzo.music.domain.order.generator.OrderIdGenerator")
    @GeneratedValue(generator = "orderIdGenerator")
    private String id;

    @Column(name="user_id")
    private Long userId;

    @Column(name="product_id")
    private Long productId;

    @Column(name="price")
    private int price;

    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
