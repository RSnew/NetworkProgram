package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author: xuhuakun
 * @Date: 2023/12/12 9:34
 * @describe:
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("login")
    public String login(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return "student/index";
        } else {
            return "login";
        }
    }
}
