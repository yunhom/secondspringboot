package com.yun.demo.exception;

import com.yun.demo.enums.ResultEnum;
import lombok.Data;

/**
 * @author 15091402
 * @decription
 * @date 2019/8/28
 */
@Data
public class GirlException extends RuntimeException{

    private Integer code;

    public GirlException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
