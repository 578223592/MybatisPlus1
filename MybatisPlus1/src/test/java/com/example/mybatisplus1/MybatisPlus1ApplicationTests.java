package com.example.mybatisplus1;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus1.dao.MyDao;
import com.example.mybatisplus1.pojo.Employee;
import com.example.mybatisplus1.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MybatisPlus1ApplicationTests {


    @Autowired
    MyDao myDao;

    @Autowired
    MyService myService;

    @Test
    void contextLoads() {
        Employee employee = myDao.selectById("1");
        System.out.println(employee);

    }

    @Test
    void contextLoads1() {
        Employee employee = new Employee(null, "王麻子", "1", "578223@qq.com", 2);
        int i = myDao.insert(employee);
        System.out.println(employee.getId());
    }

    @Test
    void contextLoads2() {
        Employee employee = myService.getById(1);
        System.out.println(employee);
    }


    @Test
    void contextLoads3() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id",1);
        hashMap.put("gender",1);
        List<Employee> employeeList = myService.listByMap(hashMap);
        System.out.println(employeeList);
    }
    @Test
    void contextLoads4() {
        IPage<Employee> page =new Page<Employee>(1,2);
        IPage<Employee> employeeIPage = myService.page(page);
        List<Employee> records = employeeIPage.getRecords();
        System.out.println(records);
    }
    @Test
    void contextLoads5() {
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        LambdaQueryWrapper<Employee> wrapper = queryWrapper.lambda().ge(Employee::getId, 1);
        List<Employee> list = myService.list(wrapper);
        System.out.println(list);
    }
}
