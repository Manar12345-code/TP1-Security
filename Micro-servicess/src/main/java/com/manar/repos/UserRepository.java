package com.manar.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manar.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername(String username);
}

