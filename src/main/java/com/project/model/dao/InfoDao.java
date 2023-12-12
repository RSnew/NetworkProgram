package com.project.model.dao;

import com.project.model.pojo.Info;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface InfoDao {
     public List<Info> findAll();
     public void addInfo(Info info);
     public void deleteById(Integer id);
     public Info findById(Integer id);
     public void updateById(Info info);
}
