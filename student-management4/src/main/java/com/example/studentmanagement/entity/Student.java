package com.example.studentmanagement.entity;

import com.example.studentmanagement.statics.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private Gender gender;
    private String address;
    private String phoneNumber;
    private String className;

}

