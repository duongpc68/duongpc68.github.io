package com.example.finalproject.entity;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "combo_details")
public class ComboDetails extends BaseEntity{
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn (name = "concession_id", nullable = false)
    private Concession concessionId;
    @JoinColumn (nullable = false)
    private Integer quantity;
}
