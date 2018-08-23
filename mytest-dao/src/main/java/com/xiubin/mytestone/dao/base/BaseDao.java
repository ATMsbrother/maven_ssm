package com.xiubin.mytestone.dao.base;

import java.util.List;

/**
 * @FileName
 * @Author Xiubin Chen
 * @Date 2018/8/20 14:47
 * @Description
 */
public interface BaseDao<T> {
    /**
     * 添加
     * @param var 需要添加的對象
     * @return 是否添加成功
     */
    public Boolean insert(T var);

    /**
     * 删除
     * @param var 需要删除的对象
     * @return 是否删除成功
     */
    public Boolean delete(T var);

    /**
     * 修改
     * @param var 需要修改的对象
     * @return 是否修改成功
     */
    public Boolean update(T var);

    /**
     * 查询
     * @param var 需要查询的对象
     * @return 查询的结果
     */
    public List<T> select(T var);
}
