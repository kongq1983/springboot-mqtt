package com.kq.vernemq.component;



import com.kq.vernemq.configuration.MqttConfig;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

/**
 * @author kq
 * @date 2021-12-02 14:00
 * @since 2020-0630
 */
@Component
//@Slf4j
public class MqttMessageHandler implements MessageHandler {

    @Override
    @ServiceActivator(inputChannel = MqttConfig.CHANNEL_NAME_IN)
    public void handleMessage(Message<?> message) throws MessagingException {
//        log.info("Receive MQTT message: -------------{}-------------", message.getPayload());
        System.out.println("Receive MQTT message: -------------{}-------------"+message.getPayload());
    }
}