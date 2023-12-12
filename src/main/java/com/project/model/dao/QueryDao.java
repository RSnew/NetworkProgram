package com.project.model.dao;

import com.project.model.pojo.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QueryDao {
    public List<Query> findAll();
    public void addQuery(Query query);
}
