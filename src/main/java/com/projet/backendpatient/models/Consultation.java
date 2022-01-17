package com.projet.backendpatient.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "consultation")
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsul;
    private String nomMedecin;
    private String specialiteMedicale;
    private String radiologieMedicale;
    @Temporal(TemporalType.DATE)
    private Date dateConsultation;
    private boolean paye;

    @ManyToOne
    @JoinColumn(name = "id_patient")
    private Patient pa;

    public Consultation() {
    }

    public Consultation(Long idConsul, String nomMedecin, String specialiteMedicale, String radiologieMedicale, Date dateConsultation, boolean paye) {
        this.idConsul = idConsul;
        this.nomMedecin = nomMedecin;
        this.specialiteMedicale = specialiteMedicale;
        this.radiologieMedicale = radiologieMedicale;
        this.dateConsultation = dateConsultation;
        this.paye = paye;
    }

    public Consultation(String nomMedecin, String specialiteMedicale, String radiologieMedicale, Date dateConsultation, boolean paye) {
        this.nomMedecin = nomMedecin;
        this.specialiteMedicale = specialiteMedicale;
        this.radiologieMedicale = radiologieMedicale;
        this.dateConsultation = dateConsultation;
        this.paye = paye;
    }

    public Long getIdConsul() {
        return idConsul;
    }

    public void setIdConsul(Long idConsul) {
        this.idConsul = idConsul;
    }

    public String getNomMedecin() {
        return nomMedecin;
    }

    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }

    public String getSpecialiteMedicale() {
        return specialiteMedicale;
    }

    public void setSpecialiteMedicale(String specialiteMedicale) {
        this.specialiteMedicale = specialiteMedicale;
    }

    public String getRadiologieMedicale() {
        return radiologieMedicale;
    }

    public void setRadiologieMedicale(String radiologieMedicale) {
        this.radiologieMedicale = radiologieMedicale;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public Patient getPa() {
        return pa;
    }

    public void setPa(Patient pa) {
        this.pa = pa;
    }

    public boolean isPaye() {
        return paye;
    }

    public void setPaye(boolean paye) {
        this.paye = paye;
    }
}