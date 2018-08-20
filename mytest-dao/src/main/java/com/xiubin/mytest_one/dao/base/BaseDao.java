package com.xiubin.mytest_one.dao.base;

import java.util.List;

/**
 * @FileName
 * @Author Xiubin Chen
 * @Date 2018/8/20 14:47
 * @Description
 */
public interface BaseDao<T> {
    public Boolean insert(T var);
    public Boolean delete(T var);
    public Boolean update(T var);
    public List<T> select(T var);
}
