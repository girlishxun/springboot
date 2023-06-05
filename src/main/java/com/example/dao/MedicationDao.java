package com.example.dao;

import com.example.model.Medication;
import java.util.List;

public interface MedicationDao {
    Medication getMedicationById(int medicationId);
    List<Medication> getAllMedications();
    void addMedication(Medication medication);
    void updateMedication(Medication medication);
    void deleteMedication(int medicationId);
}
