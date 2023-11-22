package com.example.studentmanagement.controller;


import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @GetMapping("/students")
    public String home (Model model){
        List<Student> students = studentService.getAll();
        model.addAttribute("dsSinhVien", students);
        return "students";
    }

//    @GetMapping("/delete-book/{id}")
//    public String deleteStudent(@PathVariable("id") int id, Model model){
//        List<Student> students = studentService.de
//    }

//    @GetMapping("/create-student")

}
