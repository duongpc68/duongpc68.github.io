package com.example.testingspringboot01.entity;


import com.example.testingspringboot01.statics.AppointmentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appoitment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String customerName;
    private String customerPhone;
    private String customerEmail;
    private String appointmentDetails;
    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;
    private LocalDateTime createTime;
    private LocalDateTime approvalTime;

}


