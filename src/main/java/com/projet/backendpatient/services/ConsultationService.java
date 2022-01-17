package com.projet.backendpatient.services;

import com.projet.backendpatient.dao.ConsultationRepository;
import com.projet.backendpatient.models.Consultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {

    @Autowired
    private ConsultationRepository consultationRepository;

    public Consultation save(Consultation entity) {
        return consultationRepository.save(entity);
    }

    public List<Consultation> findAll() {
        return consultationRepository.findAll();
    }

    public Consultation findById(Long aLong) {
        return consultationRepository.findById(aLong).get();
    }

    public void deleteById(Long aLong) {
        consultationRepository.deleteById(aLong);
    }
}
