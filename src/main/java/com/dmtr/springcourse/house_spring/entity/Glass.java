package com.dmtr.springcourse.house_spring.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Glass {

    @Value("My spring boot glass")
    private String glassName;
    public Glass() {
        this.glassName = glassName;
    }
    public String getGlassName() {
        return glassName;
    }
    public void setGlassName(String glassName) {
        this.glassName = glassName;
    }
}
