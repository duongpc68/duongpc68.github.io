package com.example.finalproject.statics;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    AVAILABLE ("Available"),
    NOT_AVAILABLE("Not Available");
public String name;
}
