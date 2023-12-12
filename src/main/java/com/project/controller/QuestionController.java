package com.project.controller;

import com.project.model.pojo.Info;
import com.project.model.pojo.Query;
import com.project.model.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RequestMapping("controller")
@Controller
public class QuestionController {
    @Autowired
    private QueryService queryService;

    @RequestMapping(value = "/queryList")
    public String userList(Model model) {
        List<Query> list = queryService.findAll();
        model.addAttribute("list",list);
        return "Query";
    }
    @RequestMapping("addquery")
    public String addquery(String answerQuestion,Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addquery");
        model.addAttribute("answerQuestion",answerQuestion);
        return "addquery";
    }
    @RequestMapping("/QueryAdd")
    public String queryAdd(Query query, Model model) {
        queryService.addQuery(query);
        List<Query> list = queryService.findAll();
        model.addAttribute("list",list);
        return "Query";
    }
}
