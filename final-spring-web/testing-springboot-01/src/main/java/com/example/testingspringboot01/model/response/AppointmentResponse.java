package com.example.testingspringboot01.model.response;


import com.example.testingspringboot01.statics.AppointmentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentResponse {

    private Long id;
    private String customerName;
    private String customerPhone;
    private String customerEmail;
    private String appointmentDetails;
    private AppointmentStatus status;
    private LocalDateTime createTime;
    private LocalDateTime approvalTime;
}
