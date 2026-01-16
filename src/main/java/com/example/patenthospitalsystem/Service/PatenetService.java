package com.example.patenthospitalsystem.Service;

import com.example.patenthospitalsystem.Mapper.PatientMapper;
import com.example.patenthospitalsystem.Repository.Patentrepo;
import com.example.patenthospitalsystem.dto.PatientResponseDto;
import com.example.patenthospitalsystem.dto.patientRequestDto;
import com.example.patenthospitalsystem.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PatenetService {
    private final Patentrepo patentrepo;

    public List<PatientResponseDto> getPatients(){
        List<Patient> patients = patentrepo.findAll();
        return patients.stream().map(PatientMapper::mapToPatientResponseDto).toList();
    }
    public PatientResponseDto  createPatient(patientRequestDto patient){
       Patient newPatient = patentrepo.save(PatientMapper.mapToPatient(patient));
       return PatientMapper.mapToPatientResponseDto(newPatient);

    }













}
