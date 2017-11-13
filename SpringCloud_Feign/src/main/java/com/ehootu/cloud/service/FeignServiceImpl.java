package com.ehootu.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @author zhangyong
 * @create 2017-10-27 11:11
 **/
@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public String sayServerHi(String name) {
        return "this is  error,I am FeignServiceImpl";
    }
}
