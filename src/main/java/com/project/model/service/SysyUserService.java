package com.project.model.service;


import com.project.model.pojo.Student;
import com.project.model.pojo.Teacher;

public interface SysyUserService {

     Student studentLogin(String username, String password);

     Teacher teacherLogin(String username, String password);

     void studentRegister(Student student);

     void teacherRegister(Teacher student);

}
