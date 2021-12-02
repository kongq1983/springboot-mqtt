package com.kq.vernemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * https://docs.vernemq.com/configuring-vernemq/options
 * @author kq
 * @date 2021-12-02 13:43
 * @since 2020-0630
 */
@SpringBootApplication
public class VerneMqMqttApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(VerneMqMqttApplication.class, args);

    }


}
