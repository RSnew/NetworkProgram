package com.project.model.dao;


import com.project.model.pojo.Student;
import com.project.model.pojo.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SysUserDao {



    @Select("SELECT * FROM ssmbighomework.studenttable WHERE studentName = #{studentName} AND password = #{password}")
    Student studentLogin(@Param("studentName") String studentName, @Param("password") String password);

    @Select("SELECT * FROM ssmbighomework.teachertable WHERE teacherName = #{teacherName} AND password = #{password}")
    Teacher teacherLogin(@Param("teacherName") String teacherName, @Param("password") String password);

    @Insert("INSERT INTO ssmbighomework.studenttable (studentName, password) VALUES (#{student.studentName}, #{student.password})")
    void studentRegister(@Param("student") Student student);

    @Insert("INSERT INTO ssmbighomework.teachertable (teacherName, password) VALUES (#{teacher.teacherName}, #{teacher.password})")
    void teacherRegister(@Param("teacher") Teacher teacher);
}
