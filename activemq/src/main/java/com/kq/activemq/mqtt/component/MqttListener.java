package com.kq.activemq.mqtt.component;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.BytesMessage;
import javax.jms.JMSException;

/**
 * @author kq
 * @date 2021-12-01 13:39
 * @since 2020-0630
 */

@Component
public class MqttListener {

//    @JmsListener(destination = "mqttTopic")
//    public void test(BytesMessage bytesMessage) {
//        try {
//            byte[] bytes = new byte[(int) bytesMessage.getBodyLength()];
//            bytesMessage.readBytes(bytes);
//            String msg = new String(bytes);
//            System.out.println("msg=" + msg);
//        } catch (JMSException e) {
//            System.out.println(e);
//        }
//    }

    @JmsListener(destination = "mqttTopic")
    public void mqttTopic(String content) {

        System.out.println("msg=" + content);

    }

}
