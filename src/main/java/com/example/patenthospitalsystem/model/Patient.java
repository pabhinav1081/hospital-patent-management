package com.example.patenthospitalsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;


    @Column(nullable = false)
    private String name;

    @Email
    @Column(unique = true)
    private String email;
    private String address;

    private LocalDate date_of_birth;

    private LocalDate registered_date;



}
