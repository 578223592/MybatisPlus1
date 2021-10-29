package com.example.mybatisplus1.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName table1_employee
 */
@Data
@TableName(value = "table1_employee")
public class Employee implements Serializable {
    private Integer id;
    private String name;
    private String gender;
    private String email;
    private Integer deptId;
    private static final long serialVersionUID = 1L;

    public Employee(Integer id, String name, String gende, String email, Integer deptId) {
        this.id = id;
        this.name = name;
        this.gender = gende;
        this.email = email;
        this.deptId = deptId;
    }

    public Employee() {
    }
}