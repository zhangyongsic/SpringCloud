package com.ehootu.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangyong
 * @create 2017-10-27 10:52
 **/
@Service
public class HystrixService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://SPRINGCLOUD-USER/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return "this is error："+name;
    }

}
