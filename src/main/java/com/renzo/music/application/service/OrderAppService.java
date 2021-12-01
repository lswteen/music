package com.renzo.music.application.service;

import com.renzo.music.application.request.OrderRequest;
import com.renzo.music.application.response.OrderResponse;
import com.renzo.music.domain.order.entity.Order;
import com.renzo.music.domain.order.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderAppService {
    private final OrderService orderService;

    public List<OrderResponse> getAllByOrder(){
        List<OrderResponse> orderResponses = new ArrayList<>();

        orderService.getAllOrders().forEach(order -> {
            orderResponses.add(OrderResponse.builder()
                            .id(order.getId())
                            .productId(order.getProductId())
                            .userId(order.getUserId())
                            .price(order.getPrice())
                    .build());
        });
        return orderResponses;
    }

    public List<OrderResponse> save(List<OrderRequest> orderRequests){
        List<OrderResponse> orderResponses = new ArrayList<>();

        orderRequests.forEach(orderRequest -> {
            Order newOrder = orderService.save(Order.builder()
                    .id(orderRequest.getId())
                    .productId(orderRequest.getProductId())
                    .userId(orderRequest.getUserId())
                    .price(orderRequest.getPrice())
                    .build());
            orderResponses.add(OrderResponse.builder()
                            .id(newOrder.getId())
                            .productId(newOrder.getProductId())
                            .userId(newOrder.getUserId())
                            .price(newOrder.getPrice())
                    .build());
        });
        return orderResponses;
    }

}
