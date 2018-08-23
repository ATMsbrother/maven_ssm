package com.xiubin.mytestone.controller;

import com.xiubin.mytestone.model.Student;
import com.xiubin.mytestone.model.utils.ResultVo;
import com.xiubin.mytestone.service.StudentService;
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

    /**
     * 添加@ResponseBody直接返回json数据
     * @param id
     * @return
     */
    @RequestMapping("findAllStudentInfo.do")
    public @ResponseBody
    ResultVo findAllStudentInfo (@RequestParam("id")String id){
        Student student = new Student();
        String zero = "0";
        //在此不做过多验证判断
        if (zero.equals(id)){
            student=null;
        }else {
            student.setId(new Integer(id));
        }
        return studentService.findAllStudent(student);
    }
}
