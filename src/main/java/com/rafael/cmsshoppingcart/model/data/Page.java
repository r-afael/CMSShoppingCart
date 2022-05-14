package com.rafael.cmsshoppingcart.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "pages")
@Data
public class Page {
    
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;
    
    @Size(min=2, message = "Title must be at least 2 characters long")
    private String title;
    
    private String slug;
    
    @Size(min=5, message = "Content must be at least 5 characters long")
    private String content;
    
    private int sorting;

}
