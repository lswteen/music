package com.renzo.music.domain.order.repository;

import com.renzo.music.domain.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findById(Long id);

    List<Order> findAllByUserId(Long userId);

    List<Order> findAllByUserIdIn(List<Long> userIds);
}
