package com.ehootu.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangyong
 * @create 2017-10-26 14:03
 **/
@RestController
public class WorkController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/hi/{name}")
    public String hi(@PathVariable("name") String name){
        return restTemplate.getForObject("http://SPRINGCLOUD-USER/hi?name="+name,String.class);
    }
}
