package com.project.controller;

import com.project.model.pojo.AllProjectMap;
import com.project.model.pojo.Project;
import com.project.model.service.impl.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

@Controller
@RequestMapping("/project")
public class ProjectController {
    @Qualifier("projectServiceImpl")
    @Autowired
    private ProjectServiceImpl projectService;
    @GetMapping("uploadIndex")
    public ModelAndView projectController(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("project/UploadProject");
        return mav;
    }
    @PostMapping("uploadProject")
    public ModelAndView uploadProjectController(@RequestParam("uploadFile")MultipartFile f,
                                                @RequestParam("projectName")String projectName,
                                                @RequestParam("projectAuthorName")String projectAuthorName,
                                                @RequestParam("projectTeacherName")String projectTeacherName
                                                ) throws IOException {
        ModelAndView mav=new ModelAndView();

        String authorID= projectService.findStudentIdByName(projectAuthorName);
        String teacherID= projectService.findTeacherIdByName(projectTeacherName);

        if (f.getOriginalFilename()!=null&&authorID!=null&&teacherID!=null) {
            Project p =new Project(projectName,authorID,teacherID);
            File fir = new File(f.getOriginalFilename());
            String realPath= "D:\\Code\\IDEA\\Java\\SSM\\NetworkProgram\\src\\main\\java\\com\\project\\projectItem";
            f.transferTo(new File(realPath+"/"+f.getOriginalFilename()));
            p.setProgramPath(realPath+"/"+f.getOriginalFilename());
            projectService.addProject(p);
            mav.setViewName("project/SuccessUploadProject");  //转发到成功请求
        }else{
            mav.setViewName("project/FailedUploadProject");
        }
        return mav;
    }

    @GetMapping("judgeIndex")
    public ModelAndView judgeController(){
        ModelAndView mav=new ModelAndView();
        List<Project> allProject=projectService.findProgram();
        List<AllProjectMap> ap=new ArrayList<>();
        for (Project p : allProject) {
            String authorName= projectService.findStudentNameById(p.getProgramAuthorID());
            String teacherName= projectService.findTeacherNameById(p.getProgramTeacherID());
            int score=p.getProgramScore();
            ap.add(new AllProjectMap(p.getProgramID(),p.getProgramName(),authorName,teacherName,score,p.getProgramPath()));
        }
        mav.addObject("project_info",ap);
        mav.setViewName("project/JudgeProject");
        return mav;
    }
    @GetMapping("downloadIndex")
    public ModelAndView downloadController(){
        ModelAndView mav=new ModelAndView();
        List<Project> allProject=projectService.findProgram();
        List<AllProjectMap> ap=new ArrayList<>();
        for (Project p : allProject) {
            String authorName= projectService.findStudentNameById(p.getProgramAuthorID());
            String teacherName= projectService.findTeacherNameById(p.getProgramTeacherID());
            int score=p.getProgramScore();
            ap.add(new AllProjectMap(p.getProgramID(),p.getProgramName(),authorName,teacherName,score,p.getProgramPath()));
        }
        mav.addObject("project_info",ap);
        mav.setViewName("project/DownloadProject");
        return mav;
    }
    @PostMapping("updateScore")
    public ModelAndView updateScore(@RequestParam("updateScore") String updateScore,
                                    @RequestParam("programID") int programID){
        ModelAndView mav=new ModelAndView();
        /*
         * 判断为空返回 成绩不能为空
         */
        if(updateScore.isEmpty()) {
            mav.setViewName("project/isEmptyScoreProject");
            return mav;
        }
        /*
          判断成绩是否为数字，否则返回 成绩应为数字
          然后转换为数字注入到sql中
         */
        try{
            int score=Integer.parseInt(updateScore);
            Project p=projectService.findProjectById(programID);
            p.setProgramScore(score);
            projectService.addScore(p);
        }catch (Exception e){
            mav.setViewName("project/notDigitScoreProject");
            return mav;
        }
        mav.setViewName("project/SuccessAddScoreProject");
        return mav;
    }
    @PostMapping("downloadProject")
    public ModelAndView downloadProject(@RequestParam("programFile")String path,
                                        @RequestParam("programName")String programName) throws IOException {
        InputStream is=new FileInputStream(path);
        OutputStream out=new FileOutputStream("D:\\Code\\IDEA\\Java\\SSM\\NetworkProgram\\src\\main\\java\\com\\project\\downloadProjectItem\\"
        +programName);
        int i;
        while ((i=is.read()) != -1) {
            out.write(i);
        }
        is.close();
        out.close();
        ModelAndView mav=new ModelAndView();
        mav.setViewName("project/SuccessDownloadProject");
        return mav;
    }
}
