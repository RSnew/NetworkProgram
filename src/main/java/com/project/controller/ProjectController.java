package com.project.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@Controller
@RequestMapping("/project")
public class ProjectController {
    @GetMapping("index")
    public ModelAndView projectController(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("Project");
        return mav;
    }
    @PostMapping("uploadProject")
    public ModelAndView uploadProjectController(@RequestParam("uploadFile")MultipartFile f, HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        if (f.getOriginalFilename()!=null) {
            File fir = new File(f.getOriginalFilename());
            String realPath= "D:\\Code\\IDEA\\Java\\SSM\\NetworkProgram\\src\\main\\java\\com\\project\\projectItem";
            f.transferTo(new File(realPath+"/"+f.getOriginalFilename()));
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.print("<script type='text/javascript'>alert('成功!');</script>");
            mav.setViewName("SuccessProject");
            out.close();
        }

        return mav;
    }
}
