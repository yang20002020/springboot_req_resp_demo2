package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import com.itheima.service.impl.EmpServiceA;
import com.itheima.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

//    @RequestMapping("/listEmp")
//    public Result list(){
//        //1. 加载并解析emp.xml
//        //getClassLoader 类加载器
//        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        System.out.println(file);
//        // 第一个参数  需要解析的文件  第二个参数  对解析数据进行封装
//        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
//
//        //2. 对数据进行转换处理 - gender, job
//        empList.stream().forEach(emp -> {
//            //处理 gender 1: 男, 2: 女
//            String gender = emp.getGender();
//            if("1".equals(gender)){
//                emp.setGender("男");
//            }else if("2".equals(gender)){
//                emp.setGender("女");
//            }
//
//            //处理job - 1: 讲师, 2: 班主任 , 3: 就业指导
//            String job = emp.getJob();
//            if("1".equals(job)){
//                emp.setJob("讲师");
//            }else if("2".equals(job)){
//                emp.setJob("班主任");
//            }else if("3".equals(job)){
//                emp.setJob("就业指导");
//            }
//        });
//
//        //3. 响应数据
//        return Result.success(empList);
//    }

    private EmpService empServiceA = new EmpServiceA();
    @RequestMapping("/listEmp")
    public Result list() {
        //1. 调用service, 获取数据
        List<Emp> empList = empServiceA.listEmp();
        //3. 响应数据
        return  Result.success(empList);

    }

}
