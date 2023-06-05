package com.example.service.Impl;

import com.example.dao.FamilyMemberDao;
import com.example.model.FamilyMember;
import com.example.service.FamilyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyMemberServiceImpl implements FamilyMemberService {
    private final FamilyMemberDao familyMemberDao;
    @Autowired
    public FamilyMemberServiceImpl(FamilyMemberDao familyMemberDao) {
        this.familyMemberDao = familyMemberDao;
    }

    @Override
    public List<FamilyMember> getAllFamilyMembers() {
        return familyMemberDao.getAllFamilyMembers();
    }

    @Override
    public FamilyMember getFamilyMemberById(int memberId) {
        return familyMemberDao.getFamilyMemberById(memberId);
    }

    @Override
    public void addFamilyMember(FamilyMember familyMember) {
        familyMemberDao.addFamilyMember(familyMember);
    }

    @Override
    public void updateFamilyMember(FamilyMember familyMember) {
        familyMemberDao.updateFamilyMember(familyMember);
    }

    @Override
    public void deleteFamilyMember(int memberId) {
        familyMemberDao.deleteFamilyMember(memberId);
    }
}

