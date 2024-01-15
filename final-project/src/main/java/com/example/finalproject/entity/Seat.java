package com.example.finalproject.entity;

import com.example.finalproject.statics.SeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table (name = "Seat")
public class Seat extends BaseEntity{

    @Column (name = "seat_number", nullable = false)
    private int seatNumber;
    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "row_id", nullable = false)
    private SeatRow seatRow;
    @Column (name = "seat_type",nullable = false)
    private SeatType seatType;
    @Column (nullable = false)
    private BigInteger price;

}
