package com.yun.demo.domain;

import lombok.Data;

/**
 * http返回最外层内容
 * @author 15091402
 * @decription
 * @date 2019/8/28
 */
@Data
public class Result<T> {

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 提示码
     */
    private Integer code;

    /**
     * 返回数据
     */
    private T data;
}
