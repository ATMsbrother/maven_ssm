package com.xiubin.mytest_one.service;

import com.xiubin.mytest_one.model.Student;
import com.xiubin.mytest_one.model.utils.ResultVo;

import java.util.List;

/**
 * @FileName
 * @Author Xiubin Chen
 * @Date 2018/8/20 16:04
 * @Description
 */
public interface StudentService {
    /**
     * 添加学生
     * @param student
     * @return
     */
    Boolean addStudent(Student student);

    /**
     * 删除学生
     * @param id
     * @return
     */
    Boolean deleteStudent(Integer id);

    /**
     * 修改学生
     * @param student
     * @return
     */
    Boolean updateStudent(Student student);

    /**
     * 查询所有学生
     * @return
     */
    ResultVo findAllStudent(Student student);

}
