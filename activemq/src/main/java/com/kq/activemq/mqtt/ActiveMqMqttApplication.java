package com.kq.activemq.mqtt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * https://www.cnblogs.com/flyfire-cn/p/12127512.html
 * https://www.eclipse.org/paho/index.php?page=downloads.php
 * https://projects.eclipse.org/projects/iot.paho/downloads
 * https://repo.eclipse.org/content/repositories/paho-releases/org/eclipse/paho/org.eclipse.paho.ui.app/1.0.2/
 * @author kq
 * @date 2021-12-01 13:34
 * @since 2020-0630
 */

@SpringBootApplication
public class ActiveMqMqttApplication {


    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(ActiveMqMqttApplication.class, args);

    }

}
