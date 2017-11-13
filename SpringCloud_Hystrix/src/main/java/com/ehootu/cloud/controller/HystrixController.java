package com.ehootu.cloud.controller;

import com.ehootu.cloud.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyong
 * @create 2017-10-27 10:51
 **/
@RestController
public class HystrixController {

    @Autowired
    HystrixService hystrixService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(value = "name") String name){
        return hystrixService.hiService(name);
    }
}
