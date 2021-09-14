package com.example.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test")
public class Receiver2 {
    @RabbitHandler
    public void Receive(String cnt){
        System.out.println("Receiver 2:  "+cnt);
    }
}
