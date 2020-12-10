package com.github.edgar615.spring.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SomeConfigProperties.class)
public class SomeBeanConfiguration {

    @Bean
    @RefreshScope
    public SomeBean someBean(SomeConfigProperties someConfigProperties) {
        SomeBean someBean = new SomeBean();
        someBean.setMsg(someConfigProperties.getMsg());
        return someBean;
    }
}
