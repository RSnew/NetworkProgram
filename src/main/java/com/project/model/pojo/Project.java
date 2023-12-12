package com.project.model.pojo;

public class Project {
    private int programID;
    private String programName;
    private String programPath;
    private int programAuthorID;
    private int programScore;
    private int programTeacherID;

    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramPath() {
        return programPath;
    }

    public void setProgramPath(String programPath) {
        this.programPath = programPath;
    }

    public int getProgramAuthorID() {
        return programAuthorID;
    }

    public void setProgramAuthorID(int programAuthorID) {
        this.programAuthorID = programAuthorID;
    }

    public int getProgramScore() {
        return programScore;
    }

    public void setProgramScore(int programScore) {
        this.programScore = programScore;
    }

    public int getProgramTeacherID() {
        return programTeacherID;
    }

    public void setProgramTeacherID(int programTeacherID) {
        this.programTeacherID = programTeacherID;
    }
}
