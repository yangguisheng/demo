package com.example.demo;

import com.example.demo.rabbitmq.Sender1;
import com.example.demo.rabbitmq.Sender2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RabbitTest {
    @Autowired
    private Sender1 sender1;

    @Autowired
    private Sender2 sender2;

    @Test
    public void OneToMany(){
        for (int i = 0;i < 10; i++){
            sender1.Send();
        }
    }

    @Test
    public void ManyToMany(){
        for (int i = 0;i < 10; i++){
            sender1.Send();
        }
        for (int i = 0;i < 7; i++){
            sender2.Send();
        }
    }
}
