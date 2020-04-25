package com.example.cj.perfectstarter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created on 2020-04-25
 */
public class HandsomeService {

    @Autowired
    private HandsomeProperties handsomeProperties;

    public String getInfo() {
        return handsomeProperties.getName() + ": " + handsomeProperties.getIntroduction();
    }
}
