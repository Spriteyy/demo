package com.course.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author TesterYang
 * @create 2023-06-28 21:02
 */
public class MyHttpClient {
    @Test
    public void test1() throws IOException {
        //用来存放我们的结果
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        //这个是用来执行get方法的
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);//将get获取到的response返回回来
        //获取到响应的所有内容
        result = EntityUtils.toString(response.getEntity(),Charset.defaultCharset());
        System.out.println(result);
    }
}
