package com.project.model.pojo;

public class Project {
    private int projectID;          //项目id
    private String projectName;     //项目名称
    private String author;          //项目作者
    private String projectDetail;   //项目详细信息
    private int score;              //项目得分

    public String getProjectDetail() {
        return projectDetail;
    }

    public void setProjectDetail(String projectDetail) {
        this.projectDetail = projectDetail;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectNAME) {
        this.projectName = projectNAME;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
