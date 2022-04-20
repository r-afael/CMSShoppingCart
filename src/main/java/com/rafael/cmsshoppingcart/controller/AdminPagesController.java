package com.rafael.cmsshoppingcart.controller;

import java.util.List;

import com.rafael.cmsshoppingcart.model.data.Page;
import com.rafael.cmsshoppingcart.model.data.PageRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/pages")
public class AdminPagesController {
    
    private PageRepository pageRepo;

    public AdminPagesController( PageRepository pageRepo) {
        this.pageRepo = pageRepo;
    }

    @GetMapping
    public String index(Model model) {

        List<Page> pages = pageRepo.findAll();
        model.addAttribute("pages", pages);

        return "admin/pages/index";
    }
}
