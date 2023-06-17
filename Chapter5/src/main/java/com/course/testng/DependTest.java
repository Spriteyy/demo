package com.course.testng;

/**
 * @author TesterYang
 * @create 2023-06-17 20:14
 */

import org.testng.annotations.Test;

/**
 * 依赖测试
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();//当给test1抛出一个异常时，执行test2查看执行结果——>test1执行失败，test2被忽略
    }
    @Test(dependsOnMethods = {"test1"}) //表示test2将依赖于test1执行
    public void test2(){
        System.out.println("test2 run");
    }
}
//当test1执行失败了，test2将被忽略不执行
//在我们进行忽略测试过程中，如果被依赖的测试方法执行失败了，依赖的方法将不执行
//应用场景：当一个购物软件，登陆失败了，那么后续的所有操作都将不执行