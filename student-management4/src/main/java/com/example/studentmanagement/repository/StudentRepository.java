package com.example.studentmanagement.repository;




import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.model.request.StudentUpdateRequest;
import com.example.studentmanagement.util.FileUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class StudentRepository {
    private static final String STUDENT_DATA_FILE_NAME = "students";
    public static int AUTO_ID = 1000;
    private final FileUtil<Student> fileUtil;

    public List<Student> getAll(){return fileUtil.readDataFromFile(STUDENT_DATA_FILE_NAME, Student[].class);}

    public List<Student> delete(int id){
        List<Student> students = getAll();
        if (CollectionUtils.isEmpty(students)){
            throw new RuntimeException("Students not found");
        }
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getId() == id){
                students.remove(i);
                fileUtil.writeDataToFile(STUDENT_DATA_FILE_NAME, students);
                return students;
            }
        }
        return null;
    }
    public List<Student> createStudent (Student student){
        List<Student> students = getAll();
        if (CollectionUtils.isEmpty(students)){
            students = new ArrayList<>();
        }
        students.add(student);
        fileUtil.writeDataToFile(STUDENT_DATA_FILE_NAME, students);
        return students;
    }
    public Student findById(int id){
        List <Student> students = getAll();
        if (students == null || students.isEmpty()){
            throw new RuntimeException("Students not fount");
        }
        return students.stream().filter(s -> s.getId() == id).findFirst().get();
    }
    public List<Student> updateStudent (StudentUpdateRequest student){
        List<Student> students = getAll();
        if (CollectionUtils.isEmpty(students)){
            throw new RuntimeException("Students not found");
        }
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getId() == student.getId()){
                students.get(i).setName(student.getName());
                students.get(i).setGender(student.getGender());
                students.get(i).setAddress(student.getAddress());
                students.get(i).setPhoneNumber(student.getPhoneNumber());
                students.get(i).setClassName(student.getClassName());
                fileUtil.writeDataToFile(STUDENT_DATA_FILE_NAME, students);
                return students;
            }
        }
        return null;
    }
}
