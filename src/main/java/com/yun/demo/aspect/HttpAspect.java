package com.yun.demo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 15091402
 * @decription
 * @date 2019/8/28
 */
@Component
@Aspect
@Slf4j
public class HttpAspect {

    @Pointcut("execution(public * com.yun.demo.controller.GirlController.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        log.info("url = {}", request.getRequestURL());

        //ip
        log.info("ip = {}", request.getRemoteHost());

        //method
        log.info("method = {}", request.getMethod());

        //class
        log.info("class_method = {}",joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

        //args
        log.info("args = {}",joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter(){
        log.info("2222222222222");
    }

    @AfterReturning(returning="object", pointcut = "log()")
    public void doReturning(Object object){
        log.info("response= {}", object);
    }
}
