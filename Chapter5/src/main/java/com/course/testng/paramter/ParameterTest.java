package com.course.testng.paramter;

/**
 * @author TesterYang
 * @create 2023-06-17 20:23
 */

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 参数化测试——xml文件参数化
 * 通过xml文件配置参数执行
 */
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name = " + name + ";" + "age = " + age);
    }
}
