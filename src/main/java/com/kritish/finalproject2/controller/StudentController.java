package com.kritish.finalproject2.controller;

import com.kritish.finalproject2.model.Student;
import com.kritish.finalproject2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Get all students
    @GetMapping("/student_list")
    public String listStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "student_list";  // Corresponds to Thymeleaf template
    }

    // Show form to create a student
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("student", new Student());
        return "student_form"; // Thymeleaf form page
    }

    // Handle student creation or update
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students/student_list";
    }

    // Delete student
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students/student_list";
    }


//    // Update student
//    @GetMapping("/update/{id}")
//    public String updateStudent(@PathVariable Long id, @re) {
//        studentService.updateStudent(id, student);
//        return "redirect:/students";
//    }
}

