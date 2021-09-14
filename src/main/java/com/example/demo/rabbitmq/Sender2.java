package com.example.demo.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender2 {
    @Autowired
    private RabbitTemplate template;

    public void Send() {
        this.template.convertAndSend("test", System.currentTimeMillis() + "    from sender 2");
    }
}
