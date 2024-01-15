package com.example.finalproject.statics;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SeatType {
    STANDARD ("Standard"),
    VIP ("Vip"),
    SWEET_BOX ("Sweetbox");
    public String name;
}
