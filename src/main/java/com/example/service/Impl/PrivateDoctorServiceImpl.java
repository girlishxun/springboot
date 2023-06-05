package com.example.service.Impl;

import com.example.dao.PrivateDoctorDao;
import com.example.model.PrivateDoctor;
import com.example.service.PrivateDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivateDoctorServiceImpl implements PrivateDoctorService {
    private final PrivateDoctorDao privateDoctorDao;
    @Autowired
    public PrivateDoctorServiceImpl(PrivateDoctorDao privateDoctorDao) {
        this.privateDoctorDao = privateDoctorDao;
    }

    @Override
    public List<PrivateDoctor> getAllPrivateDoctors() {
        return privateDoctorDao.getAllPrivateDoctors();
    }

    @Override
    public PrivateDoctor getPrivateDoctorById(int doctorId) {
        return privateDoctorDao.getPrivateDoctorById(doctorId);
    }

    @Override
    public void addPrivateDoctor(PrivateDoctor privateDoctor) {
        privateDoctorDao.addPrivateDoctor(privateDoctor);
    }

    @Override
    public void updatePrivateDoctor(PrivateDoctor privateDoctor) {
        privateDoctorDao.updatePrivateDoctor(privateDoctor);
    }

    @Override
    public void deletePrivateDoctor(int doctorId) {
        privateDoctorDao.deletePrivateDoctor(doctorId);
    }
}

