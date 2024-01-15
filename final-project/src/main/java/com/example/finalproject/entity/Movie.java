package com.example.finalproject.entity;

import com.example.finalproject.entity.BaseEntity;
import com.example.finalproject.statics.Genres;
import com.example.finalproject.statics.Rated;
import com.example.finalproject.statics.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Movie")
public class Movie extends BaseEntity {
    @Column(name = "movie_title_org", length = 100, nullable = false)
    private String movieTitleOriginal;
    @Column(name = "movie_title_vn", length = 100, nullable = false)
    private String movieTitleVietnamese;
    @Column(name = "performers", length = 250, nullable = false)
    private String perfomerName;
    @Column(name = "film_director", length = 100, nullable = false)
    private String filmDirector;
    @Column(name = "movie_content", length = 250, nullable = false)
    private String movieContent;
    @Column(length = 250, nullable = false)
    private String image;
    @Column(length = 250, nullable = false)
    private String trailer;
    @Column(name = "publish_time", nullable = false)
    private LocalDateTime publishTime;
    @Column(nullable = false)
    private Status status;
    @Column(name = "movie_duration", length = 250,nullable = false)
    private Time movieDuration;
    @Column (nullable = false)
    private Rated rated;
    @Column(nullable = false)
    private Genres genres;
}
