package com.projet.backendpatient.controllers;

import com.projet.backendpatient.models.Consultation;
import com.projet.backendpatient.services.ConsultationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/consultation")
public class ConsultationController {

    @Autowired
    private ConsultationService consultationService;

    @ApiOperation("Ajouter une consultation")
    @PostMapping(path = "/addConsultation")
    public Consultation save(Consultation entity) {
        return consultationService.save(entity);
    }

    @ApiOperation("Modifier une consultation")
    @PutMapping(path = "/updateConsultation")
    public Consultation update(Consultation entity) {
        return consultationService.save(entity);
    }

    @ApiOperation("Liste des consultations")
    @GetMapping(path = "/getAllConsultation")
    public List<Consultation> findAll() {
        return consultationService.findAll();
    }

    @ApiOperation("Trouver une consultation")
    @GetMapping(path = "/getConsultation/{id}")
    public Consultation findById(@PathVariable Long id) {
        return consultationService.findById(id);
    }

    @ApiOperation("Supprimer une consultation")
    @DeleteMapping(path = "/deleteConsultation/{id}")
    public void deleteById(@PathVariable Long id) {
        consultationService.deleteById(id);
    }
}
