package com.example.btvn02.statics;

public enum TypeOfReader {
    SV ("Sinh viên"),
    HV_CH("Học Viên Cao Học"),
    GV ("Giáo viên");
public String value;

    TypeOfReader(String value) {
        this.value = value;
    }
}
