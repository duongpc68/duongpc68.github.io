package com.example.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "Seat_row")
public class SeatRow extends BaseEntity{

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "room_id", nullable = false)
    private Room room;
    @Column (name = "[row_number]", nullable = false)
    private String rowNumber;
}
