package com.example.service.Impl;

import com.example.dao.HealthRecordDao;
import com.example.model.HealthRecord;
import com.example.service.HealthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthRecordServiceImpl implements HealthRecordService {
    private final HealthRecordDao healthRecordDao;
    @Autowired
    public HealthRecordServiceImpl(HealthRecordDao healthRecordDao) {
        this.healthRecordDao = healthRecordDao;
    }

    @Override
    public List<HealthRecord> getAllHealthRecords() {
        return healthRecordDao.getAllHealthRecords();
    }

    @Override
    public HealthRecord getHealthRecordById(int recordId) {
        return healthRecordDao.getHealthRecordById(recordId);
    }

    @Override
    public void addHealthRecord(HealthRecord healthRecord) {
        healthRecordDao.addHealthRecord(healthRecord);
    }

    @Override
    public void updateHealthRecord(HealthRecord healthRecord) {
        healthRecordDao.updateHealthRecord(healthRecord);
    }

    @Override
    public void deleteHealthRecord(int recordId) {
        healthRecordDao.deleteHealthRecord(recordId);
    }
}
