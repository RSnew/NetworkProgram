package com.project.model.pojo;

public class AllProjectMap {
    private int programID;
    private String programName;
    private String programPath;
    private String programAuthorID;
    private String programAuthorName;
    private int programScore;
    private String programTeacherID;
    private String programTeacherName;

    public AllProjectMap(int programID,String programName, String programAuthorName, String programTeacherName,int programScore,String programPath) {
        this.programID=programID;
        this.programName = programName;
        this.programAuthorName = programAuthorName;
        this.programTeacherName = programTeacherName;
        this.programScore=programScore;
        this.programPath=programPath;
    }


    public AllProjectMap() {
    }

    public String getProgramAuthorName() {
        return programAuthorName;
    }

    public void setProgramAuthorName(String programAuthorName) {
        this.programAuthorName = programAuthorName;
    }

    public String getProgramTeacherName() {
        return programTeacherName;
    }

    public void setProgramTeacherName(String programTeacherName) {
        this.programTeacherName = programTeacherName;
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
