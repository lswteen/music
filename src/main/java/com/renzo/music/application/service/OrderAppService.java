package com.renzo.music.application.service;

import com.renzo.music.application.response.OrderResponse;
import com.renzo.music.domain.order.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderAppService {
    private final OrderService orderService;

    public List<OrderResponse> getAllByUser(){
        return null;
    }
}
