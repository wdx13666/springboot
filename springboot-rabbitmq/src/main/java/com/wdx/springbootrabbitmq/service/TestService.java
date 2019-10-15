package com.wdx.springbootrabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @RabbitListener(queues = "wdxque")
    public void receive(String message){
        System.out.println(message);
    }
}
