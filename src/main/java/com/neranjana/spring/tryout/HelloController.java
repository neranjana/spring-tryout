package com.neranjana.spring.tryout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @Value("${my.properties.first}")
//    private String myPropertiesFirst;

    @Autowired
    private MyConfigProperties myConfigProperties;

    @GetMapping("/")
    public String sayHello(){
        String returnValue = "Hello \n" + myConfigProperties.getFirst() +
                " " + myConfigProperties.getCityList().get(1) +
                " " + myConfigProperties.getHomeAddress().get("streetName") +
                " " + myConfigProperties.getWorkAddress().getStreetName();
        return returnValue;
    }
}
