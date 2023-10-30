package com.example.btvn02.entity;

import com.example.btvn02.statics.TypeOfReader;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reader {
    private int id;
    private String name;
    private String address;
    private int phoneNumber;
    private LocalDate dOb;
    private TypeOfReader typeOfReader;
}
