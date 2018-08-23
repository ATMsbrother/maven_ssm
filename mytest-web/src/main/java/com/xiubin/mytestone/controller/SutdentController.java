package com.xiubin.mytestone.controller;

import com.xiubin.mytestone.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @FileName
 * @Author Xiubin Chen
 * @Date 2018/8/20 17:13
 * @Description
 */
@Controller
@RequestMapping("/student/")
public class SutdentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("home")
    public String home (Model model){
        model.addAttribute("menuSelected1","home");
        return "student/home";
    }

    @RequestMapping("studentInfo")
    public String studentInfo (Model model){
        model.addAttribute("menuSelected1", "studentInfo");
        return "student/studentInfo";}
}
