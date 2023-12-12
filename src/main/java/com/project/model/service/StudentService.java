package com.project.model.service;

import com.project.model.pojo.Student;

import java.util.List;

public interface StudentService {
    public Student findByStudentId(int studentID);
    public void modifyStudent(Student student);
    public void deleteStudent(int studentID);
}
