package com.example.finalproject.entity;

import com.example.finalproject.entity.BaseEntity;
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
@Builder
@Table (name = "Theatre")
public class Theatre extends BaseEntity {
    @Column (length = 255, nullable = false)
    private String name;
    @Column (length = 15, nullable = false)
    private String phone;
    @Column (length = 255, nullable = false)
    private String address;
    @Column (length = 255, nullable = false)
    private String region;
}
