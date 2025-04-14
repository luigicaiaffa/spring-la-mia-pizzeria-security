package org.lessons.java.spring_la_mia_pizzeria_crud.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping
    public String homePage(Authentication authentication, Model model) {
        model.addAttribute("username", authentication.getName());

        return "/home/home";
    }
    
}
