package com.mywebapp.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class pageConroller {
    @RequestMapping("index")
    public String index(Model model){
        return "page";
    }
}
