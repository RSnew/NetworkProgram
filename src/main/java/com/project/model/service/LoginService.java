package com.project.model.service;

import com.project.model.pojo.User;

import java.util.List;

public interface LoginService {
    public List<User> findUser(User u);//输入用户名查信息
}
