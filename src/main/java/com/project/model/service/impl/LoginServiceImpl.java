package com.project.model.service.impl;

import com.project.model.dao.LoginDao;
import com.project.model.pojo.User;
import com.project.model.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service

public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;
    public List<User> findUser(User u){
        return loginDao.findUser(u);
    }
}
