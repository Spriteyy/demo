package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author TesterYang
 * @create 2023-06-17 19:41
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher11运行");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher22运行");
    }
}
