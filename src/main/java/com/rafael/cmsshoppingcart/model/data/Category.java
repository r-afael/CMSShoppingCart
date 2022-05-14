package com.rafael.cmsshoppingcart.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "categories")
@Data
public class Category {
    
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;

    @Size(min=2, message = "Name must be at least 2 characters long")
    private String name;

    private String slug;
    
    private int sorting;


}
