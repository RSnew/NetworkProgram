package com.project.model.service.impl;

import com.project.model.dao.InfoDao;
import com.project.model.pojo.Info;
import com.project.model.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoDao infoDao;

    public List<Info> findAll() {
        return infoDao.findAll();
    }
    @Override
    public void addInfo(Info info) {
        infoDao.addInfo(info);
    }
    @Override
    public void deleteById(Integer id) {
        infoDao.deleteById(id);
    }
    @Override
    public Info findById(Integer id) {
        return infoDao.findById(id);
    }
    @Override
    public void updateById(Info info) {
        infoDao.updateById(info);
    }
}
