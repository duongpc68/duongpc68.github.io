package com.example.finalproject.entity;

import com.example.finalproject.entity.BaseEntity;
import com.example.finalproject.statics.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table (name = "Coupon")
public class Coupon extends BaseEntity {
    @Column (name = "coupon_name", length = 255, nullable = false)
    private String couponName;
    @Column (name = "price_discount", length = 255, nullable = false)
    private BigDecimal priceDiscount;
    @Column (nullable = false)
    private Status status;
    @Column (nullable = false)
    private BigDecimal value;
    @Column (name = "apply_date_to", nullable = false)
    private LocalDateTime applyDateTo;
}
