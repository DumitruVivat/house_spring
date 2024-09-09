package com.dmtr.springcourse.house_spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Window {

    private Glass glass;
    @Autowired
    public Window(Glass glass) {
        this.glass = glass;
    }
    public Glass getGlass() {
        return glass;
    }
    public void setGlass(Glass glass) {
        this.glass = glass;
    }
}
