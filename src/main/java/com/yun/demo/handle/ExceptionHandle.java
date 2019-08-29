package com.yun.demo.handle;

import com.yun.demo.domain.Result;
import com.yun.demo.exception.GirlException;
import com.yun.demo.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 15091402
 * @decription
 * @date 2019/8/28
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(), girlException.getMessage());
        }
        log.error("【未知异常】，{}", e);
        return ResultUtil.error(-1, "未知异常");
    }
}
