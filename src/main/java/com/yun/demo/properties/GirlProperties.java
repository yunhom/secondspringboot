package com.yun.demo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 15091402
 * @decription
 * @date 2019/8/28
 */
@Component
@ConfigurationProperties(prefix="girl")
@Data
public class GirlProperties {

    private String cupSize;

    private Integer age;
}
