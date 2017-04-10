package com.javacodenet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    @Autowired
    RandomValues randomValues;

    @RequestMapping("/random")
    public String randomMessage() {
        return "Your random string message is: " + randomValues.getRandomStringMessage()
         + ", Your random integer value is: " + randomValues.getRandomInteger()
         + ", Your random integer value with 50 to 500 range: " + randomValues.getRandomIntegerWithRange()
         + ", Your random integer value with 1 to 10 range : " + randomValues.getRandomIntegerWithSpecialRange();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}