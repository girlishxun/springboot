package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointmentId;
    private String medicalCard;
    private int doctorId;
    private String appointmentProject;
    private Date appointmentTime;
    private String appointmentStatus;

    // Constructors, getters, and setters

    public Appointment() {
    }

    public Appointment(int appointmentId, String medicalCard, int doctorId, String appointmentProject, Date appointmentTime, String appointmentStatus) {
        this.appointmentId = appointmentId;
        this.medicalCard = medicalCard;
        this.doctorId = doctorId;
        this.appointmentProject = appointmentProject;
        this.appointmentTime = appointmentTime;
        this.appointmentStatus = appointmentStatus;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(String medicalCard) {
        this.medicalCard = medicalCard;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getAppointmentProject() {
        return appointmentProject;
    }

    public void setAppointmentProject(String appointmentProject) {
        this.appointmentProject = appointmentProject;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }
}
