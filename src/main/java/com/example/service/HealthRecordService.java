package com.example.service;

import com.example.model.HealthRecord;

import java.util.List;

public interface HealthRecordService {
    List<HealthRecord> getAllHealthRecords();
    HealthRecord getHealthRecordById(int recordId);
    void addHealthRecord(HealthRecord healthRecord);
    void updateHealthRecord(HealthRecord healthRecord);
    void deleteHealthRecord(int recordId);
}

