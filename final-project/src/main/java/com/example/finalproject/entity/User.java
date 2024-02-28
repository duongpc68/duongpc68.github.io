package com.example.finalproject.entity;


import com.example.finalproject.entity.BaseEntity;
import com.example.finalproject.statics.Gender;
import com.example.finalproject.statics.Roles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "full_name", length = 100, nullable = false)
    private String fullName;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(length = 50)
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(length = 255, nullable = false)
    private String address;
    @Column
    @Email(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Please enter a valid email address")
    private String email;
    @Column(length = 10)
    private String phone;
    @Column(name = "deleted_date_time")
    private LocalDateTime deletedDateTime;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
    @Column(nullable = false)
    private String password;
}
