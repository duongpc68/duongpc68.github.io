package com.example.studentmanagement.statics;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

public enum Gender {
    MALE ("Nam"),
    FEMALE ("Nữ");
    public String value;

    Gender(String value) {
        this.value = value;
    }
}
