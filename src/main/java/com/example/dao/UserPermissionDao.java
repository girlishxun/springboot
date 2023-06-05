package com.example.dao;

import com.example.model.UserPermission;
import java.util.List;

public interface UserPermissionDao {
    UserPermission getUserPermissionById(int permissionId);
    List<UserPermission> getAllUserPermissions();
    void addUserPermission(UserPermission permission);
    void updateUserPermission(UserPermission permission);
    void deleteUserPermission(int permissionId);
}
