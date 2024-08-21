//package com.example.demo.config;
//
//import org.springframework.amqp.core.*;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RabbitMQConfig {
//    @Bean
//    public RabbitTemplate rabbitTemplate() {
//        return new RabbitTemplate();
//    }
//
//    @Bean("scheduleDelayExchange")
//    public DirectExchange scheduleDelayExchange(){
//        return ExchangeBuilder.directExchange("schedule.delay").delayed().durable(true).build();
//    }
//
//    @Bean("scheduleQueue")
//    public Queue scheduleQueue() {
//        return QueueBuilder.durable("schedule").build();
//    }
//
//    @Bean
//    public Binding scheduleBinding(DirectExchange scheduleDelayExchange,
//                                   Queue scheduleQueue) {
//        return BindingBuilder.bind(scheduleQueue).to(scheduleDelayExchange).with("schedule");
//    }
//}
