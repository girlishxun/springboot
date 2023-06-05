package com.example.service;

import com.example.model.FamilyMember;

import java.util.List;

public interface FamilyMemberService {
    List<FamilyMember> getAllFamilyMembers();
    FamilyMember getFamilyMemberById(int memberId);
    void addFamilyMember(FamilyMember familyMember);
    void updateFamilyMember(FamilyMember familyMember);
    void deleteFamilyMember(int memberId);
}

