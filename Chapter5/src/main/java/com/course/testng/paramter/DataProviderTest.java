package com.course.testng.paramter;

/**
 * @author TesterYang
 * @create 2023-06-18 15:35
 */

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * 参数化测试——DataProvider参数化
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name=" + name + ";" + "age=" + age);
    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][] {
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }

    //DataProvider根据方法进行参数化传递
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法 " + "name=" + name + ";" +"age=" + age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法 " + "name=" + name + ";" +"age=" + age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] resuit=null;

        if(method.getName().equals("test1")){
            resuit = new Object[][]{
                    {"zhangsan",20},
                    {"lisi",25}
            };
        }else if (method.getName().equals("test2")){
            resuit = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }
        return resuit;
    }
}
