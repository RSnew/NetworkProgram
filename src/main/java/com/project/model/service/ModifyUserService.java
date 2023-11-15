package com.project.model.service;

import com.project.model.dao.ModifyUserDao;
import com.project.model.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ModifyUserService {
    public List<User> modifyUser(User u);
}
