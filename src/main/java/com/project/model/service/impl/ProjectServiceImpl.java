package com.project.model.service.impl;

import com.project.model.dao.ProjectDao;
import com.project.model.pojo.AllProjectMap;
import com.project.model.pojo.Project;
import com.project.model.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Qualifier("projectDao")
    @Autowired
    private ProjectDao projectDao;
    @Override
    public void addProject(Project p) {
        projectDao.addProject(p);
    }

    @Override
    public String findTeacherIdByName(String s) {
        return projectDao.findTeacherIdByName(s);
    }

    @Override
    public String findStudentIdByName(String s) {
        return projectDao.findStudentIdByName(s);
    }

    @Override
    public void addProgramPath(Project p) {
        projectDao.addProgramPath(p);
    }

    @Override
    public void addScore(Project p) {
        projectDao.addScore(p);
    }
    public List<Project> findProgram(){
        return projectDao.findProgram();
    }
    public String findTeacherNameById(String s){
        return projectDao.findTeacherNameById(s);
    };
    public String findStudentNameById(String s){
        return projectDao.findStudentNameById(s);

    }
    public Project findProjectById(int id){
        return projectDao.findProjectById(id);
    }
}
