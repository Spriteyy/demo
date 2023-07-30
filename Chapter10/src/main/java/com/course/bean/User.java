package com.course.bean;

import lombok.Data;
import springfox.documentation.swagger.web.ApiResourceController;

/**
 * @author TesterYang
 * @create 2023-07-30 15:46
 */
@Data
public class User {
    private String userName;
    private String passWord;
    private String name;
    private String age;
    private String six;
}
