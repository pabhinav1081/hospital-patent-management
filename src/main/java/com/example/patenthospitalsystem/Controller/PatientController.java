package com.example.patenthospitalsystem.Controller;

import com.example.patenthospitalsystem.Service.PatenetService;
import com.example.patenthospitalsystem.dto.PatientResponseDto;
import com.example.patenthospitalsystem.dto.patientRequestDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatenetService patentService;

    @GetMapping()
    public ResponseEntity<List<PatientResponseDto>> getPatients(){
        List<PatientResponseDto> patients = patentService.getPatients();
        return ResponseEntity.ok(patients);
    }

    @PostMapping
    public ResponseEntity<PatientResponseDto> createPatient(@Valid @RequestBody patientRequestDto patientRequestDto){
        PatientResponseDto patient = patentService.createPatient(patientRequestDto);
        return ResponseEntity.ok(patient);
    }





}
