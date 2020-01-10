package com.springboot.first.dao;

import com.springboot.first.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Date: 2020-01-10-12-09
 * Module:
 * Description:
 *
 * @author:
 */
@Mapper
public interface TestDao {
    public List<Test> findAll();
}
