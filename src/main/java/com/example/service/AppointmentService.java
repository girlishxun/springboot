package com.example.service;

import com.example.model.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAllAppointments();
    Appointment getAppointmentById(int appointmentId);
    void addAppointment(Appointment appointment);
    void updateAppointment(Appointment appointment);
    void deleteAppointment(int appointmentId);
}
