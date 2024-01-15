package com.example.finalproject.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "member_card")
public class MemberCard extends BaseEntity{

    @OneToOne (fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn (name = "user_email", nullable = false)
    private User user;

    @Column (name = "date_register", nullable = false)
    private LocalDate dateRegister;

    @Column (name = "total_spend", nullable = false)
    private BigDecimal totalSpend;
}
