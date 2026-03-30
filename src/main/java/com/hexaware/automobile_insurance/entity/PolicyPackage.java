package com.hexaware.automobile_insurance.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "policy_packages")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PolicyPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;         // e.g., Basic, Standard, Premium

    private String description;

    @Column(nullable = false)
    private Double basePremium;

    @Column(nullable = false)
    private String coverageType; // e.g., Third-party, Comprehensive

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VehicleType vehicleType;

    @OneToMany(mappedBy = "policyPackage", cascade = CascadeType.ALL)
    private List<AddOn> addOns;
}