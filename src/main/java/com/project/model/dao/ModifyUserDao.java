package com.project.model.dao;

import com.project.model.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModifyUserDao {
    //修改用户信息
    public List<User> modifyUser(User u);
}
