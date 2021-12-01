package com.renzo.music.domain.order.service;

import com.renzo.music.domain.order.entity.Order;
import com.renzo.music.domain.order.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public Order save(Order order){
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public List<Order> getAllByUserId(Long userId){
        return orderRepository.findAllByUserId(userId);
    }

    public List<Order> getAllByUserIds(List<Long> userIds){
        return orderRepository.findAllByUserIdIn(userIds);
    }



}
