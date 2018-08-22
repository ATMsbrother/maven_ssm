package com.xiubin.mytest_one.service.impl;

import com.xiubin.mytest_one.dao.StudentDao;
import com.xiubin.mytest_one.model.Student;
import com.xiubin.mytest_one.model.utils.ResultVo;
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

    public ResultVo findAllStudent(Student student) {
        ResultVo resultVo = new ResultVo();
        List<Student> students = studentDao.select(student);
        if (students.size()>0){
            resultVo.setSuccess(true);
            resultVo.setResult(students);
        }else {
            resultVo.setMessage("没有找到相关信息");
        }
        return resultVo;
    }
}
