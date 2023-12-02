package com.example.studentmanagement.controller;

import com.example.studentmanagement.model.request.SubjectCreationRequest;
import com.example.studentmanagement.model.response.SubjectResponse;
import com.example.studentmanagement.service.SubjectService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/subjects")
@AllArgsConstructor
public class SubjectController {
    private SubjectService subjectService;

    @GetMapping
    public String getSubjects(Model model){
        List<SubjectResponse> subjects = subjectService.getSubjects();
        model.addAttribute("dsMonHoc", subjects);
        return "subjects";
    }
    @PostMapping
    public ResponseEntity<?> createSubject(@RequestBody @Valid SubjectCreationRequest subjectCreationRequest){
        subjectService.createSubject(subjectCreationRequest);
        return ResponseEntity.ok(null);
    }

}
