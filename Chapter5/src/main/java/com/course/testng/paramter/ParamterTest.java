package com.course.testng.paramter;

/**
 * @author TesterYang
 * @create 2023-06-17 20:23
 */

import org.testng.annotations.Test;

/**
 * 参数化测试——xml文件参数化
 */
public class ParamterTest {
    @Test
    
    public void paramTest1(String name,int age){
        System.out.println("name = " + name + "age = " + age);
    }
}
