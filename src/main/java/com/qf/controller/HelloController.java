package com.qf.controller;

import com.qf.domain.Person;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 54110 on 2019-07-08.
 */
@Controller
@ConfigurationProperties(prefix = "my")
public class HelloController {
   /* @Value("${person.name}")
    private String name;*/

    private List<Person> person;

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return person+"hello Spring Boot";
    }
    @RequestMapping("/user")
    @ResponseBody
    public String userList(){
      return   userService.findList().toString();
    }


    public List<Person> getPerson() {
        return person;


    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }
}
