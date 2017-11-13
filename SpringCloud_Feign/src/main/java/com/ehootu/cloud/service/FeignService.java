package com.ehootu.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangyong
 * @create 2017-10-27 10:24
 **/
@FeignClient(value = "SPRINGCLOUD-USER",fallback = FeignServiceImpl.class)
public interface FeignService {

    @GetMapping("/hi")
    public String sayServerHi(@RequestParam(value = "name") String name);


}
