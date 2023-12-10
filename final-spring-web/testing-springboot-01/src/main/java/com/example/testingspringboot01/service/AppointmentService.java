package com.example.testingspringboot01.service;


import com.example.testingspringboot01.entity.Appointment;
import com.example.testingspringboot01.model.response.AppointmentResponse;
import com.example.testingspringboot01.repository.AppointmentJpaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentJpaRepository appointmentJpaRepository;

    public List<AppointmentResponse> getAppointments() {
        List<Appointment> appointments = appointmentJpaRepository.findAll();

        return appointments.stream()
                .map(appointment -> AppointmentResponse.builder()
                        .id(appointment.getId())
                        .customerName(appointment.getCustomerName())
                        .customerPhone(appointment.getCustomerPhone())
                        .customerEmail(appointment.getCustomerEmail())
                        .appointmentDetails(appointment.getAppointmentDetails())
                        .status(appointment.getStatus())
                        .createTime(appointment.getCreateTime())
                        .approvalTime(appointment.getApprovalTime())
                        .build()
                )
                .collect(Collectors.toList());
    }
}
