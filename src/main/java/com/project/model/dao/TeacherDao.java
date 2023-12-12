package com.project.model.dao;

import com.project.model.pojo.Teacher;

public interface TeacherDao {
    public Teacher findByTeacherId(int teacherID);
    public void modifyTeacher(Teacher teacher);
    public void deleteTeacher(int TeacherID);
}
