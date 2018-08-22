package com.xiubin.mytest_one.controller;

import com.xiubin.mytest_one.model.Student;
import com.xiubin.mytest_one.model.utils.ResultVo;
import com.xiubin.mytest_one.service.StudentService;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/studentApi/")
public class SutdentApiController {

    @Resource
    private StudentService studentService;

    @RequestMapping("findAllStudentInfo.do")
    public @ResponseBody//添加@ResponseBody直接返回json数据
    ResultVo findAllStudentInfo (@RequestParam("id")String id){
        Student student = new Student();
        //在此不做过多验证判断
        if ("0".equals(id)){
            student=null;
        }else {
            student.setId(new Integer(id));
        }
        return studentService.findAllStudent(student);
    }
}
