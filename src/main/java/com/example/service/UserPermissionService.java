package com.example.service;

import com.example.model.UserPermission;

import java.util.List;

public interface UserPermissionService {
    List<UserPermission> getAllUserPermissions();
    UserPermission getUserPermissionById(int permissionId);
    void addUserPermission(UserPermission userPermission);
    void updateUserPermission(UserPermission userPermission);
    void deleteUserPermission(int permissionId);
}
