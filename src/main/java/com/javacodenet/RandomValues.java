package com.javacodenet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomValues {

    @Value("${randomStringMessage}")
    private String randomStringMessage;

    @Value("${randomInteger}")
    private String randomInteger;

    @Value("${randomIntegerWithRange}")
    private String randomIntegerWithRange;

    @Value("${randomIntegerWithSpecialRange}")
    private String randomIntegerWithSpecialRange;

    public String getRandomStringMessage() {
        return randomStringMessage;
    }

    public void setRandomStringMessage(String randomStringMessage) {
        this.randomStringMessage = randomStringMessage;
    }

    public String getRandomInteger() {
        return randomInteger;
    }

    public void setRandomInteger(String randomInteger) {
        this.randomInteger = randomInteger;
    }

    public String getRandomIntegerWithRange() {
        return randomIntegerWithRange;
    }

    public void setRandomIntegerWithRange(String randomIntegerWithRange) {
        this.randomIntegerWithRange = randomIntegerWithRange;
    }

    public String getRandomIntegerWithSpecialRange() {
        return randomIntegerWithSpecialRange;
    }

    public void setRandomIntegerWithSpecialRange(String randomIntegerWithSpecialRange) {
        this.randomIntegerWithSpecialRange = randomIntegerWithSpecialRange;
    }
}
