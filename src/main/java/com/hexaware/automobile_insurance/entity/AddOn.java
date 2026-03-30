package com.hexaware.automobile_insurance.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "add_ons")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddOn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;         // e.g., Zero Depreciation, Roadside Assistance

    private String description;

    @Column(nullable = false)
    private Double extraCost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "policy_package_id", nullable = false)
    private PolicyPackage policyPackage;
}