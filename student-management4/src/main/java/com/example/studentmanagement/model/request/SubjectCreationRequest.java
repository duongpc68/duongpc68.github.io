package com.example.studentmanagement.model.request;


import com.example.studentmanagement.statics.SubjectType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class SubjectCreationRequest {
    @NotBlank
    private String name;
    private int credit;
    private SubjectType subjectType;
}
