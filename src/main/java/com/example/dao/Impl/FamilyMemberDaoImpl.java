package com.example.dao.Impl;

import com.example.dao.FamilyMemberDao;
import com.example.model.FamilyMember;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class FamilyMemberDaoImpl implements FamilyMemberDao {

    private final SqlSession sqlSession;

    @Autowired
    public FamilyMemberDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public FamilyMember getFamilyMemberById(int memberId) {
        return sqlSession.selectOne("com.example.dao.FamilyMemberMapper.getFamilyMemberById", memberId);
    }

    @Override
    public List<FamilyMember> getAllFamilyMembers() {
        return sqlSession.selectList("com.example.dao.FamilyMemberMapper.getAllFamilyMembers");
    }

    @Override
    public void addFamilyMember(FamilyMember familyMember) {
        sqlSession.insert("com.example.dao.FamilyMemberMapper.addFamilyMember", familyMember);
    }

    @Override
    public void updateFamilyMember(FamilyMember familyMember) {
        sqlSession.update("com.example.dao.FamilyMemberMapper.updateFamilyMember", familyMember);
    }

    @Override
    public void deleteFamilyMember(int memberId) {
        sqlSession.delete("com.example.dao.FamilyMemberMapper.deleteFamilyMember", memberId);
    }
}
