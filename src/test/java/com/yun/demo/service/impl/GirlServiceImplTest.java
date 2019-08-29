package com.yun.demo.service.impl;

import com.yun.demo.domain.Girl;
import com.yun.demo.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceImplTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findByAge() {
        List<Girl> girlList = girlService.findByAge(20);
        Assert.assertTrue(girlList.size()>0);
    }

    @Test
    @Transactional
    public void testSave(){
        Girl girl =  new Girl();
        girl.setCupSize("E");
        girl.setAge(19);
        Girl resultGirl = girlService.save(girl);
        Assert.assertNotNull(resultGirl);
    }

    @Test
    public void testFindAll(){
        List<Girl> girlList = girlService.findAll();
        Assert.assertTrue(girlList.size()>0);
    }
}