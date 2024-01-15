package com.example.finalproject.entity;

import com.example.finalproject.entity.BaseEntity;
import com.example.finalproject.statics.ConcessionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "Concession")
public class Concession extends BaseEntity {
    @Column (length = 255, nullable = false)
    private String name;
    @Column (name = "concession_type", nullable = false)
    @Enumerated (EnumType.STRING)
    private ConcessionType type;


}
