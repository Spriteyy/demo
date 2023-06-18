package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author TesterYang
 * @create 2023-06-18 16:05
 */

/**
 * 多线程测试-xml文件实现
 */
public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
