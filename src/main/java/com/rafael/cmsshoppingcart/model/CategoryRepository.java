package com.rafael.cmsshoppingcart.model;

import java.util.List;

import com.rafael.cmsshoppingcart.model.data.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
    Category findByName(String name);

    List<Category> findAllByOrderBySortingAsc();

    Category findBySlug(String slug);
}
