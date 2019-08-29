package com.yun.demo.enums;

import lombok.Data;

public enum ResultEnum {
    UNKOWN_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"你可能还在上小学吧"),
    MIDDLE_SCHOOL(101,"你可能还在上中学吧"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
