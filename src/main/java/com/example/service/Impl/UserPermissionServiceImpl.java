package com.example.service.impl;

import com.example.dao.UserPermissionDao;
import com.example.model.UserPermission;
import com.example.service.UserPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPermissionServiceImpl implements UserPermissionService {

    private final UserPermissionDao userPermissionDao;

    @Autowired
    public UserPermissionServiceImpl(UserPermissionDao userPermissionDao) {
        this.userPermissionDao = userPermissionDao;
    }

    @Override
    public List<UserPermission> getAllUserPermissions() {
        return userPermissionDao.getAllUserPermissions();
    }

    @Override
    public UserPermission getUserPermissionById(int permissionId) {
        return userPermissionDao.getUserPermissionById(permissionId);
    }

    @Override
    public void addUserPermission(UserPermission userPermission) {
        userPermissionDao.addUserPermission(userPermission);
    }

    @Override
    public void updateUserPermission(UserPermission userPermission) {
        userPermissionDao.updateUserPermission(userPermission);
    }

    @Override
    public void deleteUserPermission(int permissionId) {
        userPermissionDao.deleteUserPermission(permissionId);
    }
}
