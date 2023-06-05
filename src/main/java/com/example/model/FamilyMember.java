package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class FamilyMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;
    private String medicalCard;
    private String name;
    private String gender;
    private Date birthdate;
    private String phone;
    private String allergyHistory;
    private String drugIntolerance;

    // Constructors, getters, and setters

    public FamilyMember() {
    }

    public FamilyMember(int memberId, String medicalCard, String name, String gender, Date birthdate, String phone, String allergyHistory, String drugIntolerance) {
        this.memberId = memberId;
        this.medicalCard = medicalCard;
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.phone = phone;
        this.allergyHistory = allergyHistory;
        this.drugIntolerance = drugIntolerance;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(String medicalCard) {
        this.medicalCard = medicalCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAllergyHistory() {
        return allergyHistory;
    }

    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory;
    }

    public String getDrugIntolerance() {
        return drugIntolerance;
    }

    public void setDrugIntolerance(String drugIntolerance) {
        this.drugIntolerance = drugIntolerance;
    }
}
