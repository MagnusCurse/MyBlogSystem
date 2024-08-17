package com.example.demo.scheduled;

import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Component;

import java.nio.channels.Channel;

@Component
public class ScheduledReceiver {
    public void receive(Message message, Channel channel) {
        Long deliveryTag = message.getMessageProperties().getDeliveryTag();



    }
}
