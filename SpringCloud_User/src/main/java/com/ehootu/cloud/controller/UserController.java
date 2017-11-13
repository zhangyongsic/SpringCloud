package com.ehootu.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangyong
 * @create 2017-10-26 13:58
 **/

@RestController
public class UserController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name, HttpServletRequest request) {
        String url = request.getScheme() +"://" + request.getServerName()

                + ":" +request.getServerPort()

                + request.getServletPath();
        return "hi "+name+",i am from port:" +port  +" and  url:"+url;
    }
}
