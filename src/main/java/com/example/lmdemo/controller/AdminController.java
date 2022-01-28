package com.example.lmdemo.controller;

import com.example.lmdemo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("admin")
public class AdminController {

    private BookingRepository bookingRepository;


    @Autowired
    public AdminController(Environment environment, BookingRepository bookingRepository) {

        this.bookingRepository = bookingRepository;


    }

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Izaan Aamir");

        return "admin/index";
    }


}
