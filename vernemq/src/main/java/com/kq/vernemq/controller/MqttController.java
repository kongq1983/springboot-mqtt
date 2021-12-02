package com.kq.vernemq.controller;

import com.kq.vernemq.component.IMqttSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author kq
 * @date 2021-12-02 15:23
 * @since 2020-0630
 */

@RestController
@RequestMapping("/mqtt")
public class MqttController {

    AtomicInteger atomicInteger = new AtomicInteger();

    @Autowired
    private IMqttSender mqttSender;


    @RequestMapping("/send")
    public Map<String,Object> getTokenInfo(HttpServletRequest request) {
        String result = "ok";

        String content = request.getParameter("content");

        String res = content+atomicInteger.incrementAndGet();

        mqttSender.sendToMqtt(res);
        mqttSender.sendToMqtt("mqttTopic",res);


        Map<String,Object> map = new HashMap<>();
        map.put("code","16000000");
        map.put("result",res);

        return map;
    }



}
