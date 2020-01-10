package com.springboot.first.dao;

import com.springboot.first.domain.TestJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Date: 2020-01-10-12-29
 * Module:
 * Description:
 *
 * @author:
 */
public interface TestRepository  extends JpaRepository<TestJpa,Integer>, JpaSpecificationExecutor<TestJpa> {
}
