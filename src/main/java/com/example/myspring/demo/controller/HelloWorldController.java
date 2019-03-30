package com.example.myspring.demo.controller;

import com.example.myspring.demo.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = { RequestMethod.GET })
    public String hello() {
        System.out.println("get Hello.");
        return "Hello World!";
    }

    @RequestMapping(value = "/user", method = { RequestMethod.POST })
    @ResponseBody
    public String user(@RequestBody User user) {
        System.out.println("POJO: " + user.getClass().getName() +
                ", hash code: " + user.hashCode() + ", " + user.toString());

        return user.toString();
    }


}
