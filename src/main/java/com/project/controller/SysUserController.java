package com.project.controller;


import javax.servlet.http.HttpSession;


import com.project.model.pojo.Student;
import com.project.model.pojo.Teacher;
import com.project.model.service.SysyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysyUserService sysyUserService;



    @GetMapping("login")
    public String login(){
        return "login";
    }


    @GetMapping("register")
    public String register(){
        return "register";
    }



    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        @RequestParam("isAdmin") String isAdmin,
                        HttpSession session,
                        Model model) {
        // 如果是学生登录
        if ("0".equals(isAdmin)) {
            Student student = sysyUserService.studentLogin(username, password);
            if (student != null) {
                // 登录成功，将用户信息存入 session
                session.setAttribute("user", student.getStudentName());
                // 重定向到学生的个人页面或其他页面
                return "redirect:/student/index";
            }
        } else {
            // 如果是老师登录
            Teacher teacher = sysyUserService.teacherLogin(username, password);
            if (teacher != null) {
                // 登录成功，将用户信息存入 session
                session.setAttribute("user", teacher.getTeacherName());
                // 重定向到老师的个人页面或其他页面
                return "redirect:/teacher/index";
            }
        }

        // 登录失败，设置错误信息到 model 中
        model.addAttribute("error", "Invalid username or password");
        // 返回登录页面
        return "login";
    }

    @GetMapping("/logout")
    public String logout( HttpSession session){
        session.removeAttribute("user");
        return "login";
    }
}
