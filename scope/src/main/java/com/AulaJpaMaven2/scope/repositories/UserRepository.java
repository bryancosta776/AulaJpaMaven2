package com.AulaJpaMaven2.scope.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaJpaMaven2.scope.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
