package com.xiubin.mytest_one.test;

import com.xiubin.mytest_one.model.Student;
import com.xiubin.mytest_one.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @FileName
 * @Author Xiubin Chen
 * @Date 2018/8/20 17:17
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class ServiceTest {
    @Resource
    private StudentService studentService;

    @Test
    public void addTest(){
        Student student = new Student();
        student.setName("王同学");
        student.setSex(false);
        student.setAddress("江西");
        System.out.println(studentService.addStudent(student));
    }
}
