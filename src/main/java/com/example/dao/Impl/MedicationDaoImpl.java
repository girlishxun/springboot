package com.example.dao.Impl;

import com.example.dao.MedicationDao;
import com.example.model.Medication;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class MedicationDaoImpl implements MedicationDao {

    private final SqlSession sqlSession;

    @Autowired
    public MedicationDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Medication getMedicationById(int medicationId) {
        return sqlSession.selectOne("com.example.dao.MedicationMapper.getMedicationById", medicationId);
    }

    @Override
    public List<Medication> getAllMedications() {
        return sqlSession.selectList("com.example.dao.MedicationMapper.getAllMedications");
    }

    @Override
    public void addMedication(Medication medication) {
        sqlSession.insert("com.example.dao.MedicationMapper.addMedication", medication);
    }

    @Override
    public void updateMedication(Medication medication) {
        sqlSession.update("com.example.dao.MedicationMapper.updateMedication", medication);
    }

    @Override
    public void deleteMedication(int medicationId) {
        sqlSession.delete("com.example.dao.MedicationMapper.deleteMedication", medicationId);
    }
}
