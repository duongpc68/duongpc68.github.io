package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.model.request.StudentCreationRequest;
import com.example.studentmanagement.model.response.StudentResponse;
import com.example.studentmanagement.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Controller
@RequestMapping("/students") // base path
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public String getStudents(Model model) {
        List<StudentResponse> students = studentService.getStudents();
        model.addAttribute("dsSinhVien", students);
        return "students";
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentsDetails(@PathVariable Integer id) {
        StudentResponse student = studentService.getStudentsDetails(id);
        return ResponseEntity.ok(student);

    }

    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody @Valid StudentCreationRequest request) {
        studentService.createStudent(request);
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Integer id) {
        studentService.delete(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable Integer id , @RequestBody @Valid StudentCreationRequest request) {
        studentService.updateStudent(id, request);
        return ResponseEntity.ok(null);
    }


}
