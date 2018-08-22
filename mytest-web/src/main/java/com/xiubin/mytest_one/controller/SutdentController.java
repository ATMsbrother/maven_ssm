package com.xiubin.mytest_one.controller;

import com.xiubin.mytest_one.model.Student;
import com.xiubin.mytest_one.model.utils.ResultVo;
import com.xiubin.mytest_one.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
