package com.project.model.service;

import com.project.model.pojo.Query;

import java.util.List;

public interface AnswerService {
    public List<Query> findAll();
    public void addQuery(Query query);
}
