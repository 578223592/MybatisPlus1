package com.example.mybatisplus1.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus1.dao.MyDao;
import com.example.mybatisplus1.pojo.Employee;
import com.example.mybatisplus1.service.MyService;
import org.springframework.stereotype.Service;

/**
 * Author: Admin
 * Date: 2021/10/27 18:30
 * FileName: MyServiceImpl
 * Description:
 */
@Service
public class MyServiceImpl extends ServiceImpl<MyDao, Employee> implements MyService {

}
