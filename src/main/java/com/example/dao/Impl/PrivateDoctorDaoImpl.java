package com.example.dao.Impl;

import com.example.dao.PrivateDoctorDao;
import com.example.model.PrivateDoctor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class PrivateDoctorDaoImpl implements PrivateDoctorDao {

    private final SqlSession sqlSession;

    @Autowired
    public PrivateDoctorDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public PrivateDoctor getPrivateDoctorById(int doctorId) {
        return sqlSession.selectOne("com.example.dao.PrivateDoctorMapper.getPrivateDoctorById", doctorId);
    }

    @Override
    public List<PrivateDoctor> getAllPrivateDoctors() {
        return sqlSession.selectList("com.example.dao.PrivateDoctorMapper.getAllPrivateDoctors");
    }

    @Override
    public void addPrivateDoctor(PrivateDoctor privateDoctor) {
        sqlSession.insert("com.example.dao.PrivateDoctorMapper.addPrivateDoctor", privateDoctor);
    }

    @Override
    public void updatePrivateDoctor(PrivateDoctor privateDoctor) {
        sqlSession.update("com.example.dao.PrivateDoctorMapper.updatePrivateDoctor", privateDoctor);
    }

    @Override
    public void deletePrivateDoctor(int doctorId) {
        sqlSession.delete("com.example.dao.PrivateDoctorMapper.deletePrivateDoctor", doctorId);
    }
}
