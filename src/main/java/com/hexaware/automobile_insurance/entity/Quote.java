package com.hexaware.automobile_insurance.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "quotes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proposal_id", nullable = false)
    private Proposal proposal;

    @Column(nullable = false)
    private Double baseAmount;

    @Column(nullable = false)
    private Double addonAmount;

    @Column(nullable = false)
    private Double totalPremium;

    @Column(nullable = false)
    private LocalDate generatedDate;

    @Column(nullable = false)
    private LocalDate validUntil;
}