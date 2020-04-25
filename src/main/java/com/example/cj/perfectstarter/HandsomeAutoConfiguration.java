package com.example.cj.perfectstarter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 2020-04-25
 */
@Configuration
@EnableConfigurationProperties(HandsomeProperties.class)
public class HandsomeAutoConfiguration {

    @Bean
    public HandsomeService handsomeService() {
        return new HandsomeService();
    }

}
