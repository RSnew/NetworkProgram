package com.project.model.service.impl;

import com.project.model.dao.TeacherDao;
import com.project.model.pojo.Teacher;
import com.project.model.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;
    @Override
    public Teacher findByTeacherId(int teacherID) {
        return teacherDao.findByTeacherId(teacherID);
    }

    @Override
    public void modifyTeacher(Teacher teacher) {
        teacherDao.modifyTeacher(teacher);
    }

    @Override
    public void deleteTeacher(int teacherID) {
        teacherDao.deleteTeacher(teacherID);
    }
}
