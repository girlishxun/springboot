package com.example.service.Impl;

import com.example.dao.MedicationDao;
import com.example.model.Medication;
import com.example.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationServiceImpl implements MedicationService {
    private final MedicationDao medicationDao;
    @Autowired
    public MedicationServiceImpl(MedicationDao medicationDao) {
        this.medicationDao = medicationDao;
    }

    @Override
    public List<Medication> getAllMedications() {
        return medicationDao.getAllMedications();
    }

    @Override
    public Medication getMedicationById(int medicationId) {
        return medicationDao.getMedicationById(medicationId);
    }

    @Override
    public void addMedication(Medication medication) {
        medicationDao.addMedication(medication);
    }

    @Override
    public void updateMedication(Medication medication) {
        medicationDao.updateMedication(medication);
    }

    @Override
    public void deleteMedication(int medicationId) {
        medicationDao.deleteMedication(medicationId);
    }
}

