package com.project.controller;

import com.project.model.pojo.Info;
import com.project.model.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("controller")
@Controller
public class InfoController {

    @Autowired
    private InfoService infoService;

    @RequestMapping(value = "/infoList")
    public String userList(Model model) {
        List<Info> list = infoService.findAll();
        model.addAttribute("list",list);
        return "info";
    }
    @RequestMapping("/infoAdd")
    public String addInfo(Info info, Model model) {
        infoService.addInfo(info);
        List<Info> list = infoService.findAll();
        model.addAttribute("list",list);
        return "info";
    }
    @RequestMapping("/infoDelete")
    public String infoDelete(Integer id,Model model) {
        infoService.deleteById( id );
        List<Info> list = infoService.findAll();
        model.addAttribute("list",list);
        return "info";
    }

    @RequestMapping(value = "/infoUpdate")
    public String infoUpdate(String infoID, Model model) {
        Info infoById = infoService.findById(Integer.valueOf(infoID));
        model.addAttribute("infoById",infoById);
        return "edit";
    }

    @RequestMapping("/infoUpdateList")
    public String infoUpdateList(Info info, Model model) {
        infoService.updateById(info);
        List<Info> list = infoService.findAll();
        model.addAttribute("list",list);
        return "info";
    }

    @RequestMapping("add")
    public String add(String teacherId,Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");
        model.addAttribute("infoTeacherID",teacherId);
        return "add";
    }
    @RequestMapping("delete")
    public ModelAndView delete(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("info");
        return modelAndView;
    }
    @RequestMapping("infoupdate")
    public ModelAndView infoupdate(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        return modelAndView;
    }

}
