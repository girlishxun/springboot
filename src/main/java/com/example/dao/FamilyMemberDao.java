package com.example.dao;

import com.example.model.FamilyMember;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FamilyMemberDao {
    FamilyMember getFamilyMemberById(int memberId);
    List<FamilyMember> getAllFamilyMembers();
    void addFamilyMember(FamilyMember familyMember);
    void updateFamilyMember(FamilyMember familyMember);
    void deleteFamilyMember(int memberId);
}
