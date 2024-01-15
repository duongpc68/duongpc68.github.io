package com.example.finalproject.statics;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Size {
    X_MALL ("X"),
    LARGE ("L"),
    X_LARGE("XL");
    public String name;
}
