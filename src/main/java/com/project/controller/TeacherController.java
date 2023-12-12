package com.project.controller;

import com.project.model.pojo.Info;
import com.project.model.pojo.Student;
import com.project.model.pojo.Teacher;
import com.project.model.service.InfoService;
import com.project.model.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @Autowired
    private InfoService infoService;

    @GetMapping("login")
    public String login(Model model){
        List<Info> infoList = infoService.findAll();
        model.addAttribute("infoList",infoList);
        return "TeacherIndex";
    }
    @RequestMapping("JudgeProject")
    public ModelAndView judgeProject(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("JudgeProject");
        return modelAndView;
    }
    @RequestMapping("TeacherUpdate")
    public ModelAndView teacherUpdate(@RequestParam(value="teacherid")Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("teacherid",id);
        modelAndView.setViewName("TeacherUpdate");
        return modelAndView;
    }
    @RequestMapping("modifyTeacher")
    public ModelAndView modifyTeacher(@RequestParam(value="teacherid") int id,@RequestParam(value="teacherName")String teacherName,@RequestParam(value="password")String password){
        Teacher teacher = teacherService.findByTeacherId(id);
        teacher.setTeacherName(teacherName);
        teacher.setPassword(password);
        teacherService.modifyTeacher(teacher);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("TeacherIndex");
        return modelAndView;
    }
    @RequestMapping("Query")
    public ModelAndView query(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("answer");
        return modelAndView;
    }
    @RequestMapping("Info")
    public ModelAndView Info(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("info");
        return modelAndView;
    }
    @RequestMapping("findByTeacherId")
    public ModelAndView findByTeacherId(@RequestParam("teacherid") Integer id){
        Teacher teacherList =teacherService.findByTeacherId(id);
        ModelAndView modelAndView = new ModelAndView();
        if(teacherList==null){
            modelAndView.addObject("message","您还没有登录过，请重新登录");
            modelAndView.setViewName("login");
        }
        else {
            String name = teacherList.getTeacherName();
            String password = teacherList.getPassword();
            modelAndView.addObject("id", id);
            modelAndView.addObject("name", name);
            modelAndView.addObject("password", password);
            modelAndView.setViewName("TeacherShow");
        }
        return modelAndView;
    }
    @RequestMapping("TeacherDelete")
    public ModelAndView teacherDelete(@RequestParam(value = "teacherid") int id){
        teacherService.deleteTeacher(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        modelAndView.addObject("message","您已删除个人信息，请重新登录");
        return modelAndView;
    }

}
