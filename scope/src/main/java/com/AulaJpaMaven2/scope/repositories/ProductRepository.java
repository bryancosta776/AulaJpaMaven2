package com.AulaJpaMaven2.scope.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaJpaMaven2.scope.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
