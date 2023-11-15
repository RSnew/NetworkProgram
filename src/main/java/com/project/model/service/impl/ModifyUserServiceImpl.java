package com.project.model.service.impl;

import com.project.model.dao.ModifyUserDao;
import com.project.model.pojo.User;
import com.project.model.service.ModifyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ModifyUserServiceImpl implements ModifyUserService {
    @Autowired
    private ModifyUserDao modifyUserDao;
    @Override
    public List<User> modifyUser(User u) {
        return modifyUserDao.modifyUser(u);
    }
}
