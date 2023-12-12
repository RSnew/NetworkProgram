package com.project.model.service.impl;

import com.project.model.dao.QueryDao;
import com.project.model.pojo.Query;
import com.project.model.service.AnswerService;
import com.project.model.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private QueryDao queryDao;
    @Override
    public List<Query> findAll() {
        return queryDao.findAll();
    }

    @Override
    public void addQuery(Query query) {
        queryDao.addQuery(query);
    }
}
