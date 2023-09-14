package com.itheima.dao.impl;

import com.itheima.dao.EmpDao;
import com.itheima.pojo.Emp;
import com.itheima.utils.XmlParserUtils;

import java.util.List;

public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        //1. 加载并解析emp.xml
        //getClassLoader 类加载器
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        // 第一个参数  需要解析的文件  第二个参数  对解析数据进行封装
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;

    }
}
