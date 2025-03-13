package com.kritish.finalproject2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Mapping for the homepage
    @GetMapping("/")
    public String home() {
        return "homepage"; // The name of the HTML file without the .html extension
    }

    @GetMapping("/jobopenings")
    public String job () {
        return "jobopenings"; // The name of the HTML file without the .html extension
    }

    @GetMapping("/student_list")
    public String studentlist () {
        return "student_list"; // The name of the HTML file without the .html extension
    }

    @GetMapping("/signup")
    public String signup () {
        return "signup"; // The name of the HTML file without the .html extension
    }
}

