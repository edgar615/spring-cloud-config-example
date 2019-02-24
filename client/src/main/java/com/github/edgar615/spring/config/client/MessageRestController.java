package com.github.edgar615.spring.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Once the /actuator/refresh event is triggered for the service, all the beans that are annotated with @RefreshScope will be refreshed
@RefreshScope
@RestController
public class MessageRestController {

    @Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;

    @RequestMapping("/msg")
    String getMsg() {
        return this.msg;
    }
}
