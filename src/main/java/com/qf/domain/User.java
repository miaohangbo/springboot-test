package com.qf.domain;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * Created by 54110 on 2019-07-08.
 */
@ApiModel(value = "用户对象")
@Data
public class User {
    // 主键
    private Long id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 姓名
    private String name;
    //此处省略getter和setter方法 .. ..
}
