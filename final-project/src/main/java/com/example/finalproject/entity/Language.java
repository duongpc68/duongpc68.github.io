package com.example.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "Language")
public class Language extends  BaseEntity{
    @Column (name = "language_name", length = 250,nullable = false)
    private String name;
}
