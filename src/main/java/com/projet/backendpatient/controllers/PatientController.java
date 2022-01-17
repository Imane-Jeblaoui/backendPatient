package com.projet.backendpatient.controllers;

import com.projet.backendpatient.models.Patient;
import com.projet.backendpatient.services.PatientService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @ApiOperation("Ajouter un patient")
    @PostMapping(path = "/addPatient")
    public Patient save(Patient entity) {
        return patientService.save(entity);
    }

    @ApiOperation("Modifier Patient")
    @PutMapping(path = "/updatePatient")
    public Patient update(Patient entity){
        return patientService.save(entity);
    }

    @ApiOperation("Trouver un patient ")
    @GetMapping(path = "/getPatient/{id}")
    public Patient findById(@PathVariable Long id) {
        return patientService.findById(id);
    }

    @ApiOperation("Supprimer un patient")
    @DeleteMapping (path = "/deletePatient/{id}")
    public void deleteById(@PathVariable Long id) {
        patientService.deleteById(id);
    }

    @ApiOperation("Liste des patients")
    @GetMapping("/getPatients")
    public List<Patient> findAll() {
        return patientService.findAll();
    }
}
