package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author TesterYang
 * @create 2023-06-18 16:34
 */

/**
 * 超时测试
 */
public class TimeOutTest {
    @Test(timeOut = 3000)//单位为毫秒值
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)//单位为毫秒值
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
