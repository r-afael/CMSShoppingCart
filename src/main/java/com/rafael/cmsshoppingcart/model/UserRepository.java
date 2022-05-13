package com.rafael.cmsshoppingcart.model;

import com.rafael.cmsshoppingcart.model.data.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
    User findByUsername(String username);
}
