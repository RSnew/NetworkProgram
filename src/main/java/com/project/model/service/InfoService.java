package com.project.model.service;

import com.project.model.pojo.Info;

import java.util.List;

public interface InfoService {
    public List<Info> findAll();
    public void addInfo(Info info);
    public void deleteById(Integer infoID);

    public Info findById(Integer infoID);

    public void updateById(Info info);
}
