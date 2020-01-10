package com.springboot.first.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Table;

/**
 * Date: 2020-01-10-12-07
 * Module:
 * Description:
 *
 * @author:
 */
@Data
@ToString
@Table(name = "Test")
public class Test {
    private Integer id;
    private String name;
}
