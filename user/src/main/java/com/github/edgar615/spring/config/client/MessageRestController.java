package com.github.edgar615.spring.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {

    @Autowired
    private SomeBean someBean;

    @Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;

    @GetMapping("/msg")
    String getMsg() {
        return this.msg;
    }

    @GetMapping("/some")
    String some() {
        System.out.println(someBean);
        return someBean.getMsg();
    }
}
