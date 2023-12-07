package com.AulaJpaMaven2.scope.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaJpaMaven2.scope.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
