package com.example.mybatisplus1.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus1.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Author: Admin
 * Date: 2021/10/27 16:22
 * FileName: MyDao
 * Description:
 */
@Repository
public interface MyDao extends BaseMapper<Employee> {


}
