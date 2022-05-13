package com.rafael.cmsshoppingcart.model;

import com.rafael.cmsshoppingcart.model.data.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    
    Admin findByUsername(String username);
}
