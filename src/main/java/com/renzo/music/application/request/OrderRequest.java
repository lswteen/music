package com.renzo.music.application.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private String id;
    private Long userId;
    private Long productId;
    private int price;
}
