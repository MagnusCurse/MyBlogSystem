//package com.example.demo.scheduled.service;
//
//import com.example.demo.config.RabbitMQConfig;
//import com.example.demo.scheduled.entity.ScheduledBlog;
//import org.springframework.amqp.core.DirectExchange;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.core.MessageProperties;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Import;
//import org.springframework.stereotype.Service;
//import java.time.Duration;
//import java.time.Instant;
//
//@SpringBootTest
//@Import(RabbitMQConfig.class)
//@Service
//public class ScheduledService {
//    @Autowired
//    RabbitTemplate rabbitTemplate;
//
//    @Autowired
//    DirectExchange scheduleDelayExchange;
//
//    public void scheduledPublish(Integer day, Integer hour, Integer minute, Integer second, ScheduledBlog blog) {
//        // Calculate the delay time
//        Instant now = Instant.now();
//
//        // Set the delay time
//        Duration delay = Duration.ofDays(day)
//                .plusHours(hour)
//                .plusMinutes(minute)
//                .plusSeconds(second);
//
//        // Convert the blog to a message
//        Message message = rabbitTemplate.getMessageConverter().toMessage(blog, new MessageProperties());
//
//        // Send the message blog to the queue
////        rabbitTemplate.convertAndSend(scheduleDelayExchange.getName(), "schedule",
////                message,
////                msg -> { // Don't know why there is no DelayLong, I will figure it out latter
////                    msg.getMessageProperties().setDelayLong(delay.getSeconds());
////                    return msg;
////                });
//    }
//}
