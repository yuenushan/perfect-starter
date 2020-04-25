package com.example.cj.perfectstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created on 2020-04-25
 */
@ConfigurationProperties(prefix = "handsome")
public class HandsomeProperties {
    private String name = "david";
    private String introduction = "a handsome man";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
