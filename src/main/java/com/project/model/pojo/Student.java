package com.project.model.pojo;

public class Student {
    private int studentID;

    private String studentName;//用户名
    private String password;//密码




    public String getUserName() {
        return studentName;
    }

    public void setUserName(String userName) {
        this.studentName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
