package com.example.finalproject.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "ticket_concession_details")
public class TicketConcessionDetails extends BaseEntity{
    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "concession_id", nullable = false)
    private Concession concessionId;
    @OneToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "combo_id", nullable = false)
    private Combo comboId;
    @Column (nullable = false)
    private Integer quantity;

}
