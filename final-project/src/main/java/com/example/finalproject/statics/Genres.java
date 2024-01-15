package com.example.finalproject.statics;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Genres {
    HISTORY ("Lịch Sử"),
    SCI_FI("Khoa Học Viễn Tưởng"),
    Sport("Thể Thao"),
    Action("Hành Động"),
    Adventure("Phiêu Lưu"),
    Mystery("Thần Thoại"),
    Comedy("Hài Kịch"),
    Horror("Kinh dị"),
    Thriller("Giật Gân"),
    Fantasy("Fantasy"),
    Drama("Drama"),
    Romance("Lãng Mạng"),
    Erotic("Khiêu Dâm");
    public String name;
}
