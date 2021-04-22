package com.base.frame.base;

/**
 * Create by zjl on 2021/4/21
 * ---- 网络请求解析数据，获取data对象内容 ----
 */
public class BaseClassResultBean<T> extends BaseResultBean {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
