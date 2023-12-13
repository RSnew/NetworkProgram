package com.project.controller;

import com.project.model.pojo.Query;
import com.project.model.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/controller")
@Controller
public class AnswerController {
    @Autowired
    private AnswerService answerService;
    @RequestMapping("answerList")
    public String userList(Model model) {
        List<Query> list = answerService.findAll();
        model.addAttribute("list",list);
        return "answer";
    }
    @RequestMapping("adanswer")
    public String adanswer(String answerSolution,Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addanswer");
        model.addAttribute("answerSolution",answerSolution);
        return "addanswer";
    }
    @RequestMapping("AnswerAdd")
    public String AnswerAdd(Query query, Model model){
        answerService.addQuery(query);
        List<Query> list = answerService.findAll();
        model.addAttribute("list",list);
        return "answer";
    }
}
