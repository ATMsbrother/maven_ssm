package com.xiubin.mytestone.model;

/**
 * @FileName
 * @Author Xiubin Chen
 * @Date 2018/8/20 14:40
 * @Description 学生类
 */
public class Student {
    /**
     * id
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private Boolean sex;
    /**
     * 地址
     */
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student:----id:"+this.id+"----name:"+this.name+"----sex:"+this.sex+"----address:"+this.address;
    }
}
