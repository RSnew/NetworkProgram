package com.project.model.service.impl;

import com.project.model.dao.StudentDao;
import com.project.model.pojo.Student;
import com.project.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public Student findByStudentId(int studentID) {

        return studentDao.findByStudentId(studentID);
    }

    @Override
    public void modifyStudent(Student student) {
        studentDao.modifyStudent(student);
    }

    @Override
    public void deleteStudent(int studentID) {
        studentDao.deleteStudent(studentID);
    }
}
