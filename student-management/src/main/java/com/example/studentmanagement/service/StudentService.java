package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.model.request.StudentCreationRequest;
import com.example.studentmanagement.model.response.StudentResponse;
import com.example.studentmanagement.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    private static int AUTO_ID = 9;

    public List<StudentResponse> getStudents() {
        List<Student> students = studentRepository.getStudents();
//        List<StudentResponse> result = new ArrayList<>();

        return students.stream()
                .map(student -> StudentResponse.builder()
                        .id(student.getId())
                        .name(student.getName())
                        .address(student.getAddress())
                        .phone(student.getPhone())
                        .className(student.getClassName())
                        .build()
                )
                .collect(Collectors.toList());

//        for (int i = 0; i < students.size(); i++) {
//            Student student = students.get(i);
//            StudentResponse studentResponse = StudentResponse.builder()
//                    .id(student.getId())
//                    .name(student.getName())
//                    .address(student.getAddress())
//                    .phone(student.getPhone())
//                    .className(student.getClassName())
//                    .build();
//            result.add(studentResponse);
//        }
//        return result;
    }

    public void createStudent(StudentCreationRequest request) {
        Student student = Student.builder()
                .id(AUTO_ID++)
                .name(request.getName())
                .address(request.getAddress())
                .phone(request.getPhone())
                .className(request.getClassName())
                .build();
        studentRepository.save(student);
    }


    public void delete(Integer id) {
        List<Student> students = studentRepository.getStudents();
//        List<Student> result = new ArrayList<>();
//        for (int i = 0; i < students.size(); i++){
//            if (students.get(i).getId() == id){
//                continue;
//            }
//            result.add(students.get(i));
//        }
        List<Student> result = students
                .stream()
                .filter(s -> s.getId() != id).collect(Collectors.toList());
        studentRepository.save(result);
    }

    public StudentResponse getStudentsDetails(Integer id) {
        List<Student> students = studentRepository.getStudents();

        return students.stream().filter(s -> s.getId() == id)
                .findFirst()
                .map(student -> StudentResponse.builder()
                        .id(student.getId())
                        .name(student.getName())
                        .address(student.getAddress())
                        .phone(student.getPhone())
                        .className(student.getClassName())
                        .build())
                .get();

//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getId() == id) {
//                Student student = students.get(i);
//                return StudentResponse.builder()
//                        .id(student.getId())
//                        .name(student.getName())
//                        .address(student.getAddress())
//                        .phone(student.getPhone())
//                        .className(student.getClassName())
//                        .build();
//            }
//        }
//        return null;
    }

    public void updateStudent(Integer id, StudentCreationRequest request) {
        List<Student> students = studentRepository.getStudents();
        System.out.println(id);
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.get(i).setName(request.getName());
                students.get(i).setClassName(request.getClassName());
                students.get(i).setAddress(request.getAddress());
                students.get(i).setPhone(request.getPhone());
                break;
            }
        }
        studentRepository.save(students);
    }
}

