package com.example.testingspringboot01.statics;


public enum AppointmentStatus {

    PENDING ("Đang Chờ"),
    APPROVED ("Phê Duyệt"),
    REJECTED("Từ Chối");

    public String value;

    AppointmentStatus(String value) {
        this.value = value;
    }
}
