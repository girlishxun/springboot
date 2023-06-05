package com.example.dao;

import com.example.model.Appointment;

import java.util.List;

public interface AppointmentDao {
    Appointment getAppointmentById(int appointmentId);
    List<Appointment> getAllAppointments();
    List<Appointment> getAppointmentsByFamilyMemberId(int memberId);
    List<Appointment> getAppointmentsByPrivateDoctorId(int doctorId);
    void addAppointment(Appointment appointment);
    void updateAppointment(Appointment appointment);
    void deleteAppointment(int appointmentId);
}
