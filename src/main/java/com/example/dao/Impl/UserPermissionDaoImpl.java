package com.example.dao.Impl;

import com.example.dao.UserPermissionDao;
import com.example.model.UserPermission;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserPermissionDaoImpl implements UserPermissionDao {

    private final SqlSession sqlSession;

    @Autowired
    public UserPermissionDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public UserPermission getUserPermissionById(int permissionId) {
        return sqlSession.selectOne("com.example.dao.UserPermissionMapper.getUserPermissionById", permissionId);
    }

    @Override
    public List<UserPermission> getAllUserPermissions() {
        return sqlSession.selectList("com.example.dao.UserPermissionMapper.getAllUserPermissions");
    }

    @Override
    public void addUserPermission(UserPermission permission) {
        sqlSession.insert("com.example.dao.UserPermissionMapper.addUserPermission", permission);
    }

    @Override
    public void updateUserPermission(UserPermission permission) {
        sqlSession.update("com.example.dao.UserPermissionMapper.updateUserPermission", permission);
    }

    @Override
    public void deleteUserPermission(int permissionId) {
        sqlSession.delete("com.example.dao.UserPermissionMapper.deleteUserPermission", permissionId);
    }
}
