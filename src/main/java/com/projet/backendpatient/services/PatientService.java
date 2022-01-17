package com.projet.backendpatient.services;

import com.projet.backendpatient.dao.PatientRepository;
import com.projet.backendpatient.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient save(Patient entity) {
        return patientRepository.save(entity);
    }

    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    public Patient findById(Long aLong) {
        return patientRepository.findById(aLong).get();
    }

    public void deleteById(Long aLong) {
        patientRepository.deleteById(aLong);
    }
}
