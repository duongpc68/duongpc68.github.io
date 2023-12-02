package com.example.studentmanagement.service;


import com.example.studentmanagement.entity.Subject;
import com.example.studentmanagement.model.request.SubjectCreationRequest;
import com.example.studentmanagement.model.response.SubjectResponse;
import com.example.studentmanagement.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SubjectService {
    private final SubjectRepository subjectRepository;
    private static int AUTO_ID = 9;

    public List<SubjectResponse> getSubjects() {
        List<Subject> subjects = subjectRepository.getSubjects();
        return subjects.stream()
                .map(subject -> SubjectResponse.builder()
                        .id(subject.getId())
                        .name(subject.getName())
                        .credit(subject.getCredit())
                        .subjectType(subject.getSubjectType())
                        .build()
                )
                .collect(Collectors.toList());
    }


    public void createSubject(SubjectCreationRequest subjectCreationRequest){
        Subject subject = Subject.builder()
                .id(AUTO_ID++)
                .name(subjectCreationRequest.getName())
                .credit(subjectCreationRequest.getCredit())
                .subjectType(subjectCreationRequest.getSubjectType())
                .build();
        subjectRepository.saveSubject(subject);
    }
}

