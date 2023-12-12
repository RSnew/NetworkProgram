package com.project.model.dao;

import com.project.model.pojo.AllProjectMap;
import com.project.model.pojo.Project;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectDao {
    public void addProject(Project p);
    public String findTeacherIdByName(String s);
    public String findStudentIdByName(String s);
    public void addProgramPath(Project p);
    public void addScore(Project p);
    public List<Project> findProgram();
    public String findTeacherNameById(String s);
    public String findStudentNameById(String s);
    public Project findProjectById(int id);
}
