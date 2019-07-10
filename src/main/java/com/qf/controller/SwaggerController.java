package com.qf.controller;

import com.qf.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 54110 on 2019-07-08.
 */
@Controller
public class SwaggerController {

    /**
     *
     * @param id
     * @return
     *Resutful 类型
     * get 方式
     * post  方式
     *DELETE 方式
     * put  方式
     */

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="根据用户编号获取用户姓名", notes="test: 仅1和2有正确返回")
    @ApiImplicitParam(paramType="query", name = "id", value = "用户id", required = true, dataType = "Int")
    public String getUser(@PathVariable("id")Integer id){
        System.out.println(id);
    return "你好";
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    @ResponseBody
    @ApiOperation(value="根据用户id删除用户", notes="test: 仅1和2有正确返回")
    @ApiImplicitParam(paramType="query", name = "id", value = "用户id", required = true, dataType = "Int")
    public String deleteUser(@RequestParam  Integer id){
        System.out.println(id);
        return "删除成功";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "新增用户接口", notes = "新增用户")
    @ResponseBody
    public String insertUser(@RequestBody @ApiParam User user){
        System.out.println(user);
        return "新增成功";
    }
}
