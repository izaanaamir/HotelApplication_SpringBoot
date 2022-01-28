package com.example.lmdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping
public class ViewController {
        public String appMode;


    @GetMapping
    public String index(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Izaan Aamir");

        return "index";
    }
}
