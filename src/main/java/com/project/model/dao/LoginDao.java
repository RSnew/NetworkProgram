package com.project.model.dao;

import com.project.model.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LoginDao {
    //在数据库里搜索指定用户
    public List<User> findUser(User u);//输入用户名查信息
}
