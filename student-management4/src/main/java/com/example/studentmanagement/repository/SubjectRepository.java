package com.example.studentmanagement.repository;


import com.example.studentmanagement.entity.Subject;
import com.example.studentmanagement.util.FileUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SubjectRepository {
    private final FileUtil<Subject> subjectFileUtil;
    private static final String SUBJECT_DATA_FILE_NAME = "data/subject.json";

    public List<Subject> getSubjects() {
        return subjectFileUtil.readDataFromFile(SUBJECT_DATA_FILE_NAME, Subject[].class);
    }

    public void saveSubject(Subject subject){
        List<Subject> subjects = getSubjects();
        subjects.add(subject);
        subjectFileUtil.writeDataToFile(SUBJECT_DATA_FILE_NAME, subjects);
    }
}
