package com.project.model.pojo;

public class Project {
    private int programID;
    private String programName;
    private String programPath;
    private String programAuthorID;
    private int programScore;
    private String programTeacherID;

    public Project() {
    }

    public Project(String programName, String  programAuthorID, String  programTeacherID) {
        this.programName = programName;
        this.programAuthorID = programAuthorID;
        this.programTeacherID = programTeacherID;
    }

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

    public String getProgramAuthorID() {
        return programAuthorID;
    }

    public void setProgramAuthorID(String programAuthorID) {
        this.programAuthorID = programAuthorID;
    }

    public int getProgramScore() {
        return programScore;
    }

    public void setProgramScore(int programScore) {
        this.programScore = programScore;
    }

    public String getProgramTeacherID() {
        return programTeacherID;
    }

    public void setProgramTeacherID(String programTeacherID) {
        this.programTeacherID = programTeacherID;
    }
}
