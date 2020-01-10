package com.springboot.first.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Date: 2020-01-10-12-07
 * Module:
 * Description:
 *
 * @author:
 */
@Data
@ToString
@Entity
@Table(name = "test")
public class TestJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
}
