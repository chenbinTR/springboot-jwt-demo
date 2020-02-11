package com.example.demo.controller;

import com.example.demo.JwtHelper;
import com.example.demo.JwtHelper2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenOT
 * @date 2019-09-11
 * @see
 * @since
 */
@RestController
public class UserController {
    @RequestMapping("/user/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping("/user/login")
    public String login() {
        String jwtToken = JwtHelper.generateToken("123",456);
        return jwtToken;
    }
}
