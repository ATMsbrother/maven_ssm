package com.xiubin.mytestone.model.utils;

/**
 * @FileName
 * @Author Xiubin Chen
 * @Date 2018/8/21 14:42
 * @Description 封装类
 */
public class ResultVo<T> {
    private boolean success = false;
    private String message = null;
    private T result = null;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
