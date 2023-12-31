package com.abo.ssyx.mq.service;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //发送消息的方法
    //exchange交换机
    //routingKey路由
    //message消息
    public boolean sendMessage(String exchange,String routingKey,Object message) {
        rabbitTemplate.convertAndSend(exchange,routingKey,message);
        return true;
    }

    /**
     * 发送延迟消息的方法
     * @param exchange  交换机
     * @param routingKey    路由键
     * @param message   消息内容
     * @param delayTime 延迟时间
     * @return
     */
    public boolean sendDelayMessage(String exchange,String routingKey, Object message, int delayTime){

        //  在发送消息的时候设置延迟时间
        rabbitTemplate.convertAndSend(exchange, routingKey, message, message1 -> {
            //  设置一个延迟时间
            message1.getMessageProperties().setDelay(delayTime*1000);
            return message1;
        });
        return true;
    }

}
