package com.example.studentmanagement.repository;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.util.FileUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepository {

    private final FileUtil<Student> studentFileUtil;

    private static final String STUDENT_DATA_FILE_NAME = "data/student.json";

    public List<Student> getStudents() {
        return studentFileUtil.readDataFromFile(STUDENT_DATA_FILE_NAME, Student[].class);
    }

    public void save(Student student) {
        List<Student> students = getStudents();
        students.add(student);
        studentFileUtil.writeDataToFile(STUDENT_DATA_FILE_NAME, students);
    }
    public void save(List<Student> students) {
        studentFileUtil.writeDataToFile(STUDENT_DATA_FILE_NAME, students);
    }
}
