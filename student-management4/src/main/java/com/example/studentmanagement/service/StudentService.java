package com.example.studentmanagement.service;


import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.model.request.StudentCreationRequest;
import com.example.studentmanagement.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public List<Student> getAll() {
        return studentRepository.getAll();
    }
    public List<Student> createStudent(StudentCreationRequest studentCreationRequest){
        Student student = Student.builder()
                .id(StudentRepository.AUTO_ID++)
                .name(studentCreationRequest.getName())
                .gender(studentCreationRequest.getGender())
                .address(studentCreationRequest.getAddress())
                .phoneNumber(studentCreationRequest.getPhoneNumber())
                .className(studentCreationRequest.getClassName())
                .build();
        return studentRepository.createStudent(student);
    }

}
