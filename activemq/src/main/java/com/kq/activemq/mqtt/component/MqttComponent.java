package com.kq.activemq.mqtt.component;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * @author kq
 * @date 2021-12-01 13:36
 * @since 2020-0630
 */

@Component
public class MqttComponent {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(String message) {

        Destination destination = new ActiveMQTopic("mqttTopic");

        jmsTemplate.setPubSubDomain(true);
        try {
            jmsTemplate.convertAndSend(destination, message);
        } catch (MessagingException e) {
            System.out.println(e);
        }

    }



}
