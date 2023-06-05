package com.example.service;

import com.example.model.Medication;

import java.util.List;

public interface MedicationService {
    List<Medication> getAllMedications();
    Medication getMedicationById(int medicationId);
    void addMedication(Medication medication);
    void updateMedication(Medication medication);
    void deleteMedication(int medicationId);
}
