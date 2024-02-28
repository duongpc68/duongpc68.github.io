package com.example.finalproject.model.response;

import com.example.finalproject.statics.Gender;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse {

    private Long id;

    private String fullName;

    private LocalDate dateOfBirth;

    private Gender gender;

    private String address;

    private String email;

    private Boolean activated;

    private String avatar;

    private String phone;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    private Set<RoleResponse> roles;


}