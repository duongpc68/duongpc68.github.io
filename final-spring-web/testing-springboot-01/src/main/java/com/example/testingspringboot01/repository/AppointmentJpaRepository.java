package com.example.testingspringboot01.repository;


import com.example.testingspringboot01.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentJpaRepository extends JpaRepository<Appointment, Long > {

}
