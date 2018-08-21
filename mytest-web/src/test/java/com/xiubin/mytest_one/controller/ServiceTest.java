package com.xiubin.mytest_one.controller;

import com.xiubin.mytest_one.model.Student;
import com.xiubin.mytest_one.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

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
        student.setName("张震");
        student.setSex(false);
        student.setAddress("台湾");
        System.out.println(studentService.addStudent(student));
    }

    @Test
    public void delTest(){
        System.out.println(studentService.deleteStudent(5));
    }

    @Test
    public void updateTest(){
        Student student = new Student();
        student.setId(new Integer("3"));
        student.setName("梁朝伟");
        student.setAddress("香港");
        System.out.println(studentService.updateStudent(student));
    }

    @Test
    public void selectTest(){
        List<Student> students = studentService.findAllStudent(null);
        for (Student student:students) {
            System.out.println(student.toString());
        }
    }
}
