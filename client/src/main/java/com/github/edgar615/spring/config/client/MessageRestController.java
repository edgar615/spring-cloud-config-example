package com.github.edgar615.spring.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Once you have successfully refreshed the config client service, the new value should be reflected in the service response.
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
