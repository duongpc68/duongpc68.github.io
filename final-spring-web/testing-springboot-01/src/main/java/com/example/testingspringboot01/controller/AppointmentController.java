package com.example.testingspringboot01.controller;


import com.example.testingspringboot01.model.response.AppointmentResponse;
import com.example.testingspringboot01.service.AppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class AppointmentController {
    private final AppointmentService appointmentService;

    @GetMapping("/appointment")
    public String getAppointment(Model model){
        List<AppointmentResponse> appointments = appointmentService.getAppointments();
        model.addAttribute("dsLichKham");
        return "appointment";
    }


}
