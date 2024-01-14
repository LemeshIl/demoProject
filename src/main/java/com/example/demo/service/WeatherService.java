package com.example.demo.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Random;

@Service
public class WeatherService {

    final private LocalTime time = LocalTime.now();
    final private int temperature = new Random().nextInt(60);

    public String getCurrentTemperature() {
        return time + " -> " + temperature;
    }
}
