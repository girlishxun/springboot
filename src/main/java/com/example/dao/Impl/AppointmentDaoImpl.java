package com.example.dao.Impl;

import com.example.dao.AppointmentDao;
import com.example.model.Appointment;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppointmentDaoImpl implements AppointmentDao {

    private final SqlSession sqlSession;

    public AppointmentDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Appointment getAppointmentById(int appointmentId) {
        return sqlSession.selectOne("com.example.dao.AppointmentMapper.getAppointmentById", appointmentId);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return sqlSession.selectList("com.example.dao.AppointmentMapper.getAllAppointments");
    }

    @Override
    public List<Appointment> getAppointmentsByFamilyMemberId(int memberId) {
        return sqlSession.selectList("com.example.dao.AppointmentMapper.getAppointmentsByFamilyMemberId", memberId);
    }

    @Override
    public List<Appointment> getAppointmentsByPrivateDoctorId(int doctorId) {
        return sqlSession.selectList("com.example.dao.AppointmentMapper.getAppointmentsByPrivateDoctorId", doctorId);
    }

    @Override
    public void addAppointment(Appointment appointment) {
        sqlSession.insert("com.example.dao.AppointmentMapper.addAppointment", appointment);
    }

    @Override
    public void updateAppointment(Appointment appointment) {
        sqlSession.update("com.example.dao.AppointmentMapper.updateAppointment", appointment);
    }

    @Override
    public void deleteAppointment(int appointmentId) {
        sqlSession.delete("com.example.dao.AppointmentMapper.deleteAppointment", appointmentId);
    }
}
