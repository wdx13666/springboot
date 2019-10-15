package com.wdx.springbootrabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    //系统启动时：创建一个message的队列到rabbitMq
    @Bean(name = "message")
    public Queue queueMessage() {
        return new Queue("topic.ticket");
    }

    //系统启动时：创建一个exchange的交换器到rabbitMq
    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("exchange");
    }

    //系统启动时：将exchange的交换器和队列绑定
    //将队列topic.ticket和exchange绑定,binding_key为topic.message,完全匹配
    @Bean
    Binding bindingExchangeMessage(@Qualifier("message") Queue queueMessage,TopicExchange exchange){
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.ticket.routeKey");
    }
}
