package com.yun.demo.repository;

import com.yun.demo.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 15091402
 * @decription
 * @date 2019/8/28
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

   List<Girl> findByAge(Integer age);
}
