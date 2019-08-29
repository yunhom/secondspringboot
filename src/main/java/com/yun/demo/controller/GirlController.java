package com.yun.demo.controller;

import com.yun.demo.domain.Girl;
import com.yun.demo.domain.Result;
import com.yun.demo.service.GirlService;
import com.yun.demo.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author 15091402
 * @decription
 * @date 2019/8/28
 */
@RestController
@Slf4j
public class GirlController {

    @Autowired
    private GirlService girlService;

    @PostMapping("/girls")
    public Result<Girl> addGirl(@Valid Girl girl, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }

        return ResultUtil.success(girlService.save(girl));
    }

    @GetMapping("/girls")
    public List<Girl> getList(){
        log.info("getList");
        return girlService.findAll();
    }

    @GetMapping("/girls/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception{
        girlService.getAge(id);
    }
}
