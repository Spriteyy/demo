package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author TesterYang
 * @create 2023-06-17 19:41
 */
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void Stu1(){
        System.out.println("GroupsOnClass2中的stu11运行");
    }
    public void Stu2(){
        System.out.println("GroupsOnClass2中的stu22运行");
    }
}
