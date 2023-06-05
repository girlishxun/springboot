package com.example.dao.Impl;

import com.example.dao.HealthRecordDao;
import com.example.model.HealthRecord;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class HealthRecordDaoImpl implements HealthRecordDao {

    private final SqlSession sqlSession;

    @Autowired
    public HealthRecordDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public HealthRecord getHealthRecordById(int recordId) {
        return sqlSession.selectOne("com.example.dao.HealthRecordMapper.getHealthRecordById", recordId);
    }

    @Override
    public List<HealthRecord> getAllHealthRecords() {
        return sqlSession.selectList("com.example.dao.HealthRecordMapper.getAllHealthRecords");
    }

    @Override
    public List<HealthRecord> getHealthRecordsByFamilyMemberId(int memberId) {
        return sqlSession.selectList("com.example.dao.HealthRecordMapper.getHealthRecordsByFamilyMemberId", memberId);
    }

    @Override
    public void addHealthRecord(HealthRecord healthRecord) {
        sqlSession.insert("com.example.dao.HealthRecordMapper.addHealthRecord", healthRecord);
    }

    @Override
    public void updateHealthRecord(HealthRecord healthRecord) {
        sqlSession.update("com.example.dao.HealthRecordMapper.updateHealthRecord", healthRecord);
    }

    @Override
    public void deleteHealthRecord(int recordId) {
        sqlSession.delete("com.example.dao.HealthRecordMapper.deleteHealthRecord", recordId);
    }
}
