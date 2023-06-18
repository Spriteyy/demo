package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author TesterYang
 * @create 2023-06-18 16:02
 */

/**
 * 多线程测试
 */
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
