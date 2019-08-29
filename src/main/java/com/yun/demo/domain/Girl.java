package com.yun.demo.domain;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author 15091402
 * @decription
 * @date 2019/8/28
 */
@Entity
@Data
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty(message="cupSize不能为空")
    private String cupSize;

    @Min(value = 18, message = "未成年少女禁止入内")
    private Integer age;
}
