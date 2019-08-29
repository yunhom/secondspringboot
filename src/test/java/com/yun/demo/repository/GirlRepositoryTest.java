package com.yun.demo.repository;

import com.yun.demo.domain.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GirlRepositoryTest {

    @Autowired
    private GirlRepository girlRepository;

    @Test
    public void findByAge() {
        List<Girl> girlList = girlRepository.findByAge(20);
        Assert.assertTrue(girlList.size()>0);
    }
}