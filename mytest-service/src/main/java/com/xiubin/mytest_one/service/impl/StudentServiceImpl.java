package com.xiubin.mytest_one.service.impl;

import com.xiubin.mytest_one.dao.StudentDao;
import com.xiubin.mytest_one.model.Student;
import com.xiubin.mytest_one.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @FileName
 * @Author Xiubin Chen
 * @Date 2018/8/20 16:04
 * @Description
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    public Boolean addStudent(Student student) {
        return studentDao.insert(student);
    }

    public Boolean deleteStudent(Integer id) {
        Student student = new Student();
        student.setId(id);
        return studentDao.delete(student);
    }

    public Boolean updateStudent(Student student) {
        return studentDao.update(student);
    }

    public List<Student> findAllStudent(Student student) {
        return studentDao.select(student);
    }
}
