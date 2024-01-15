package com.example.finalproject.statics;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ConcessionType {
    POPCORN ("Popcorn"),
    DRINK ("Drink"),
    OTHER("");
    public String name;
}
