package com.dmtr.springcourse.house_spring;

import com.dmtr.springcourse.house_spring.entity.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

//    private House house;
    @Autowired
    public MyController(House house) {
//        this.house = house;
    }
    @GetMapping("/house")
    public String getHouseWindowGlass() {
//        return house.getWindow().getGlass().getGlassName();
        return "SomeText";
    }
}
