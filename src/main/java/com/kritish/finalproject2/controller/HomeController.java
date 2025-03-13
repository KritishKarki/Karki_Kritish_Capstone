package com.kritish.finalproject2.controller;

import com.kritish.finalproject2.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

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

//    @GetMapping("/student_list")
//    public String studentlist () {
//        List<Student> students = studentService.getAllStudents();
//        model.addAttribute("students", students);
//        return "student_list"; // The name of the HTML file without the .html extension
//    }

    @GetMapping("/signup")
    public String signup () {
        return "signup"; // The name of the HTML file without the .html extension
    }
}

