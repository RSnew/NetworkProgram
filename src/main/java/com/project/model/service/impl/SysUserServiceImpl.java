package com.project.model.service.impl;


import com.project.model.dao.SysUserDao;
import com.project.model.pojo.Student;
import com.project.model.pojo.Teacher;
import com.project.model.service.SysyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sysuserservice")
public class SysUserServiceImpl implements SysyUserService {

    @Autowired
    private SysUserDao sysuserDao;


    @Override
    public Student studentLogin(String username, String password) {
        return sysuserDao.studentLogin(username,password);
    }

    @Override
    public Teacher teacherLogin(String username, String password) {
        return sysuserDao.teacherLogin(username,password);
    }

    @Override
    public void studentRegister(Student student) {
        sysuserDao.studentRegister(student);
    }

    @Override
    public void teacherRegister(Teacher teacher) {
        sysuserDao.teacherRegister(teacher);

    }
}
