package com.example.finalproject.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table (name = "Combo")
public class Combo extends BaseEntity{
    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "concession_id", nullable = false)
    private Concession name;
    @Column (nullable = false)
    private String image;
    @Column (nullable = true)
    private Integer price;
}
