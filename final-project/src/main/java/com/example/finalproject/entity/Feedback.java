package com.example.finalproject.entity;

import com.example.finalproject.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "Feedback")

public class Feedback extends BaseEntity {
    @Column (length = 50)
    String name;
    @Column (length = 255, nullable = false)
    String email;
    @Column (length = 10, nullable = false)
    String phone;
    @Column (length = 255, nullable = false)
    String content;
}
