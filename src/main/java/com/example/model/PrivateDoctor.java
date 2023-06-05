package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PrivateDoctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorId;
    private String name;
    private String hospital;
    private String department;
    private String appointmentPhone;
    private String appointmentWechat;

    // Constructors, getters, and setters

    public PrivateDoctor() {
    }

    public PrivateDoctor(int doctorId, String name, String hospital, String department, String appointmentPhone, String appointmentWechat) {
        this.doctorId = doctorId;
        this.name = name;
        this.hospital = hospital;
        this.department = department;
        this.appointmentPhone = appointmentPhone;
        this.appointmentWechat = appointmentWechat;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAppointmentPhone() {
        return appointmentPhone;
    }

    public void setAppointmentPhone(String appointmentPhone) {
        this.appointmentPhone = appointmentPhone;
    }

    public String getAppointmentWechat() {
        return appointmentWechat;
    }

    public void setAppointmentWechat(String appointmentWechat) {
        this.appointmentWechat = appointmentWechat;
    }
}
