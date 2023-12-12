package com.project.model.dao;

import com.project.model.pojo.Student;

import java.util.List;

public interface StudentDao {

    public Student findByStudentId(int studentID);

    public void modifyStudent(Student student);

    public void deleteStudent(int studentID);
}
