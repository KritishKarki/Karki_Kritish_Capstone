package com.kritish.finalproject2.controller;


import com.kritish.finalproject2.model.Teacher;
import com.kritish.finalproject2.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    // Get all teachers
    @GetMapping
    public String listTeachers(Model model) {
        List<Teacher> teachers = teacherService.getAllTeachers();
        model.addAttribute("teachers", teachers);
        return "teacher_list";  // Corresponds to Thymeleaf template
    }

    // Show form to create a teacher
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("teacher", new Teacher());
        return "teacher_form"; // Thymeleaf form page
    }

    // Handle teacher creation or update
    @PostMapping("/save")
    public String saveTeacher(@ModelAttribute Teacher teacher) {
        teacherService.saveTeacher(teacher);
        return "redirect:/teachers";
    }

    // Delete teacher
    @GetMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
        return "redirect:/teachers";
    }
}

