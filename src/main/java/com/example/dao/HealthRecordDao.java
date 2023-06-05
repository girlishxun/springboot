package com.example.dao;

import com.example.model.HealthRecord;
import java.util.List;

public interface HealthRecordDao {
    HealthRecord getHealthRecordById(int recordId);
    List<HealthRecord> getAllHealthRecords();
    List<HealthRecord> getHealthRecordsByFamilyMemberId(int memberId);
    void addHealthRecord(HealthRecord healthRecord);
    void updateHealthRecord(HealthRecord healthRecord);
    void deleteHealthRecord(int recordId);
}
