package com.example.patenthospitalsystem.Repository;

import com.example.patenthospitalsystem.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface Patentrepo extends JpaRepository<Patient, Long> {
    boolean existsByEmail(String email);
}
