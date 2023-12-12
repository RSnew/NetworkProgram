package com.project.model.service;

import com.project.model.pojo.Teacher;

public interface TeacherService {

    public Teacher findByTeacherId(int teacherID);
    public void modifyTeacher(Teacher teacher);
    public void deleteTeacher(int teacherID);
}
