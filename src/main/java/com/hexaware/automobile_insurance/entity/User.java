package com.hexaware.automobile_insurance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    private String address;

    @Column(nullable = false)
    private LocalDate dob;

    @Column(nullable = false,unique = true)
    private String aadharNumber;

    @Column(nullable = false,unique = true)
    private String panNumber;

    @Transient
    public int getAge(){
        return Period.between(this.dob,LocalDate.now()).getYears();
    }


}
