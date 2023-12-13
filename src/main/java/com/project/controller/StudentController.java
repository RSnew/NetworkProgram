package com.project.controller;

import com.project.model.pojo.Info;
import com.project.model.pojo.Student;
import com.project.model.service.InfoService;
import com.project.model.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;

@Controller
@RequestMapping("students")
public class StudentController{
    @Autowired
    private StudentService studentService;

    @Autowired
    private InfoService infoService;

    @GetMapping("login")
    public String login(Model model,@RequestParam("studentid") Integer id){//从杨慧宇那获得值
        List<Info> infoList = infoService.findAll();
        model.addAttribute("infoList",infoList);
        model.addAttribute("studentid",id);
        return "StudentIndex";
    }
    @RequestMapping("Project")
    public ModelAndView project(){//@RequestParam("studentid") Integer id
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("project/UploadProject");
        return modelAndView;
    }
    @RequestMapping("StudentUpdate")
    public ModelAndView studentUpdate(@RequestParam("studentid") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentid",id);
        modelAndView.setViewName("StudentUpdate");
        return modelAndView;
    }
    @RequestMapping("modifyStudent")
    public ModelAndView modifyStudent(@RequestParam(value = "studentid") int id,@RequestParam(value="studentName")String studentName,@RequestParam(value="password")String password){
        Student student = studentService.findByStudentId(id);
        student.setStudentName(studentName);
        student.setPassword(password);
        studentService.modifyStudent(student);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentid",id);
        modelAndView.setViewName("StudentIndex");
        return modelAndView;
    }
    @RequestMapping("answer")
    public ModelAndView answer(@RequestParam("studentid") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("answer");
        return modelAndView;
    }
    @RequestMapping("findByStudentId")
    public ModelAndView findByStudentId(@RequestParam("studentid") Integer id){
        Student studentList = studentService.findByStudentId(id);
        ModelAndView modelAndView = new ModelAndView();
        if(studentList==null){
            modelAndView.addObject("message","您还没有登录过，请重新登录");
            modelAndView.setViewName("login");
        }
        else{
            String name = studentList.getStudentName();
            String password = studentList.getPassword();
            modelAndView.addObject("id",id);
            modelAndView.addObject("name",name);
            modelAndView.addObject("password",password);
            modelAndView.setViewName("StudentShow");
        }
        return modelAndView;
    }
    @RequestMapping("StudentDelete")
    public ModelAndView StudentDelete(@RequestParam(value = "studentid") int id){
        studentService.deleteStudent(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        modelAndView.addObject("message","您已删除个人信息，请重新登录");
        return modelAndView;
    }
    @RequestMapping("/download")
    public void download(HttpServletRequest request, HttpServletResponse response) throws Exception{
        //模拟文件，Project.docx为需要下载的文件
        String fileName = request.getSession().getServletContext().getRealPath("WEB-INF/upload")+"/Project.docx";
        //获取输入流
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));
        //假如以中文名下载的话
        String filename = "项目模板.docx";
        //转码，免得文件名中文乱码
        filename = URLEncoder.encode(filename,"UTF-8");
        //设置文件下载头
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
        response.setContentType("multipart/form-data");
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        int len = 0;
        while((len = bis.read()) != -1){
            out.write(len);
            out.flush();
        }
        out.close();
    }
}
