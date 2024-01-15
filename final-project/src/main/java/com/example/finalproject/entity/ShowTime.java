package com.example.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table (name = "show_time")
@Entity
public class ShowTime extends BaseEntity{

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "movie_id", nullable = false)
    public Movie movieId;
    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "room_id", nullable = false)
    public Room roomId;
    @Column (nullable = false)
    public Time time;
    @Column (nullable = false)
    public Date date;
}
