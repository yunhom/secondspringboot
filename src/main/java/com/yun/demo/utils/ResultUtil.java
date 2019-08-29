package com.yun.demo.utils;

import com.yun.demo.domain.Result;

/**
 * @author 15091402
 * @decription
 * @date 2019/8/28
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setData(object);
        result.setCode(0);
        result.setMsg("成功");
        return result;
    }

    public static Result success(){
        return success(null);
    }


    public static Result error(Integer code, String message){
        Result result = new Result();
        result.setData(null);
        result.setCode(code);
        result.setMsg(message);
        return result;
    }

    public static Result error(String message){
        return error(9999, message);
    }

}
