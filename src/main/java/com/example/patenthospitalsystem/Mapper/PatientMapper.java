package com.example.patenthospitalsystem.Mapper;

import com.example.patenthospitalsystem.dto.PatientResponseDto;
import com.example.patenthospitalsystem.dto.patientRequestDto;
import com.example.patenthospitalsystem.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDto mapToPatientResponseDto(Patient patient){
        PatientResponseDto patientResponseDto = new PatientResponseDto();
        patientResponseDto.setId(patient.getId().toString());
        patientResponseDto.setName(patient.getName());
        patientResponseDto.setEmail(patient.getEmail());
        patientResponseDto.setAddress(patient.getAddress());
        patientResponseDto.setDateOfBirth(String.valueOf(patient.getDate_of_birth()));



        return patientResponseDto;
    }
    public static Patient mapToPatient(patientRequestDto patientResponseDto){
        Patient patient = new Patient();
        patient.setName(patientResponseDto.getName());
        patient.setAddress(patientResponseDto.getAddress());
        patient.setEmail(patientResponseDto.getEmail());
        patient.setDate_of_birth(LocalDate.parse(patientResponseDto.getDateOfBirth()));
        patient.setRegistered_date(LocalDate.parse(patientResponseDto.getRegisteredDate()));
        return patient;

    }
}
