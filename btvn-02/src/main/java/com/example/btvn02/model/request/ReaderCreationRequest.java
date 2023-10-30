package com.example.btvn02.model.request;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@Component
public class ReaderCreationRequest {
    private String name;
    private LocalDate dOb;
    private String address;
    private int phoneNumber;
}
