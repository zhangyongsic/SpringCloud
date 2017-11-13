package com.ehootu.cloud.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author zhangyong
 * @create 2017-11-13 15:23
 **/

@Component
public class MQController {
    @JmsListener(destination = "sample.queue")
    @SendTo("out.queue")
    public String receiveQueue(String text) {
        System.out.println("this is "+text);
        return  "MQController:"+text;
    }
}
