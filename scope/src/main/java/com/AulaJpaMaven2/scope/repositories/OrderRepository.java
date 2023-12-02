package com.AulaJpaMaven2.scope.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaJpaMaven2.scope.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
                 