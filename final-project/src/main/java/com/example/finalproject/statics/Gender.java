package com.example.finalproject.statics;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    MALE ("MALE","Nam"),
    FEMALE ("FEMALE", "Nữ"),
    OTHER ("OTHER", "Khác");

    public String code;
    public String name;
}
