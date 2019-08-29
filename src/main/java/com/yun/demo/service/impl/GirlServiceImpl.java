package com.yun.demo.service.impl;

import com.yun.demo.domain.Girl;
import com.yun.demo.enums.ResultEnum;
import com.yun.demo.exception.GirlException;
import com.yun.demo.repository.GirlRepository;
import com.yun.demo.service.GirlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 15091402
 * @decription
 * @date 2019/8/28
 */
@Service
@Slf4j
public class GirlServiceImpl implements GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Override
    public List<Girl> findByAge(Integer age) {
        return girlRepository.findByAge(age);
    }

    @Override
    public Girl save(Girl girl) {
        return girlRepository.save(girl);
    }

    @Override
    public List<Girl> findAll() {
        return girlRepository.findAll();
    }

    @Override
    public void getAge(Integer id) throws Exception{
         Girl girl = girlRepository.findById(id).orElse(null);
         Integer age = girl.getAge();
         log.info("girl = {}", girl);
         if(age < 10){
             throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
         }else if( age > 10 && age < 18){
             throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
         }
    }
}
