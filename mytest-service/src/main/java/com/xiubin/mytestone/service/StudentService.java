package com.xiubin.mytestone.service;

import com.xiubin.mytestone.model.Student;
import com.xiubin.mytestone.model.utils.ResultVo;

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
     * 查询所有学生或者根据学生查询学生信息
     * @param student 学生
     * @return 返回给前端的结果
     */
    ResultVo findAllStudent(Student student);

}
