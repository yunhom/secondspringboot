package com.yun.demo.service;

import com.yun.demo.domain.Girl;

import java.util.List;

public interface GirlService {

    public List<Girl> findByAge(Integer age);

    public Girl save(Girl girl);

    public List<Girl> findAll();

    public void getAge(Integer id) throws Exception;
}
