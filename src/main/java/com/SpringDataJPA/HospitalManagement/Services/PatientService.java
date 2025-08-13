package com.SpringDataJPA.HospitalManagement.Services;

import com.SpringDataJPA.HospitalManagement.repositories.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    
}
