package com.project.controller;

import com.project.model.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/controller")
@Controller
public class AnswerController {
    @Autowired
    private AnswerService answerService;
}
