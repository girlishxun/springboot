package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class HealthRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordId;
    private String medicalCard;
    private int heartRate;
    private String bloodPressure;
    private float weight;
    private float temperature;
    private String other;
    private Date visitTime;
    private String diagnosisResult;
    private String visitStatus;

    // Constructors, getters, and setters

    public HealthRecord() {
    }

    public HealthRecord(int recordId, String medicalCard, int heartRate, String bloodPressure, float weight, float temperature, String other, Date visitTime, String diagnosisResult, String visitStatus) {
        this.recordId = recordId;
        this.medicalCard = medicalCard;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
        this.temperature = temperature;
        this.other = other;
        this.visitTime = visitTime;
        this.diagnosisResult = diagnosisResult;
        this.visitStatus = visitStatus;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(String medicalCard) {
        this.medicalCard = medicalCard;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getDiagnosisResult() {
        return diagnosisResult;
    }

    public void setDiagnosisResult(String diagnosisResult) {
        this.diagnosisResult = diagnosisResult;
    }

    public String getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(String visitStatus) {
        this.visitStatus = visitStatus;
    }
}
