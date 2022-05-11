package com.rafael.cmsshoppingcart;

import java.util.List;

import com.rafael.cmsshoppingcart.model.data.Category;
import com.rafael.cmsshoppingcart.model.data.CategoryRepository;
import com.rafael.cmsshoppingcart.model.data.Page;
import com.rafael.cmsshoppingcart.model.data.PageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class Common {
    
    @Autowired
    private PageRepository pageRepo;

    @Autowired
    private CategoryRepository categoryRepo;

    @ModelAttribute
    public void sharedData(Model model){

        List<Page> pages = pageRepo.findAllByOrderBySortingAsc();

        List<Category> categories = categoryRepo.findAll();

        model.addAttribute("cpages", pages);
        model.addAttribute("ccategories", categories);
    }

}
