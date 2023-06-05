package com.example.service.Impl;

import com.example.dao.AppointmentDao;
import com.example.model.Appointment;
import com.example.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentDao appointmentDao;

    public AppointmentServiceImpl(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentDao.getAllAppointments();
    }

    @Override
    public Appointment getAppointmentById(int appointmentId) {
        return appointmentDao.getAppointmentById(appointmentId);
    }

    @Override
    public void addAppointment(Appointment appointment) {
        appointmentDao.addAppointment(appointment);
    }

    @Override
    public void updateAppointment(Appointment appointment) {
        appointmentDao.updateAppointment(appointment);
    }

    @Override
    public void deleteAppointment(int appointmentId) {
        appointmentDao.deleteAppointment(appointmentId);
    }
}
