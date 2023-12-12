package com.project.model.dao;

import com.project.model.pojo.Project;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDao {
    public void addProject(Project p);
}
