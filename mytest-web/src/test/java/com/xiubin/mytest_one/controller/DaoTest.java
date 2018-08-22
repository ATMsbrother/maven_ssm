//package com.xiubin.mytest_one.controller;
//
//import com.xiubin.mytest_one.dao.StudentDao;
//import com.xiubin.mytest_one.model.Student;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * @FileName
// * @Author Xiubin Chen
// * @Date 2018/8/20 17:17
// * @Description
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
//public class DaoTest {
//    @Resource
//    private StudentDao studentDao;
//    @Test
//    public void addTest() throws Exception {
//        Student student=new Student();
////        student.setId(new Integer("1"));
//        student.setName("王同学");
//        student.setSex(false);
//        student.setAddress("中国钓鱼岛");
//        System.out.println(studentDao.insert(student));
//    }
//    @Test
//    public void deleteTest()throws Exception{
//        Student student=new Student();
//        student.setId(new Integer("1"));
//        System.out.println(studentDao.delete(student));
//
//    }
//    @Test
//    public void updateTest()throws Exception{
//        Student student=new Student();
//        student.setId(new Integer("4"));
//        student.setName("张国荣");
//        student.setAddress("香港");
//        System.out.println(studentDao.update(student));
//    }
//    @Test
//    public void select()throws Exception{
////        Student student=new Student();
////        student.setId(new Integer("1"));
//        List<Student> list=studentDao.select(null);
//        for (Student s:list){
//            System.out.println(s.toString());
//        }
//
//    }
//
//}
