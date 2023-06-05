package com.example.service;

import com.example.model.PrivateDoctor;

import java.util.List;

public interface PrivateDoctorService {
    List<PrivateDoctor> getAllPrivateDoctors();
    PrivateDoctor getPrivateDoctorById(int doctorId);
    void addPrivateDoctor(PrivateDoctor privateDoctor);
    void updatePrivateDoctor(PrivateDoctor privateDoctor);
    void deletePrivateDoctor(int doctorId);
}
