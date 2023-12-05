package com.AulaJpaMaven2.scope.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaJpaMaven2.scope.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
