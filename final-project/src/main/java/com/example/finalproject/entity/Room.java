package com.example.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "Room")
public class Room extends BaseEntity{
    @Column (name = "room_name", length = 50, nullable = false)
    private String name;
    @Column (name = "room_size", nullable = false)
    private int roomSize;
    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "theatre_id", nullable = false)
    private Theatre theatre;
}
