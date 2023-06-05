package com.example.dao;

import com.example.model.PrivateDoctor;
import java.util.List;

public interface PrivateDoctorDao {
    PrivateDoctor getPrivateDoctorById(int doctorId);
    List<PrivateDoctor> getAllPrivateDoctors();
    void addPrivateDoctor(PrivateDoctor privateDoctor);
    void updatePrivateDoctor(PrivateDoctor privateDoctor);
    void deletePrivateDoctor(int doctorId);
}
