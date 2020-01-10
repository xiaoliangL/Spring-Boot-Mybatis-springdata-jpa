package com.springboot.first.controller;

import com.springboot.first.dao.TestDao;
import com.springboot.first.dao.TestRepository;
import com.springboot.first.domain.Test;
import com.springboot.first.domain.TestJpa;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Date: 2020-01-10-12-11
 * Module:
 * Description:
 *
 * @author:
 */
@Api("测试Dao")
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestDao testDao;

    @Autowired
    TestRepository testRepository;


    @ApiOperation(value="查询test表中所有", notes="有mybati来执行")
    @GetMapping("/findAllMybatis")
    public String findAllMybatis(){
        List<Test> all = testDao.findAll();
        return all.toString();
    }

    @ApiOperation(value="查询test表中所有", notes="右jpa来执行")
    @GetMapping("/findAllSpringDataJpa")
    public String findAllSpringDataJpa(){
        List<TestJpa> all = testRepository.findAll();
        return all.toString();
    }
}
