package com.example.demo.service;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class TouristService {
    //firstCase
   private final WeatherService weatherService;
    public String getWeather() {
        return weatherService.getCurrentTemperature();
    }

    //SecondCase
//    private final ApplicationContext context;
//    public String getWeather() {
//        return context.getBean(WeatherService.class).getCurrentTemperature();
//    }

    //ThirdCase
//    private final ObjectFactory<WeatherService> objectFactory;
//    public String getWeather() {
//        return objectFactory.getObject().getCurrentTemperature();
//    }


    //FoursCase
//    @Lookup
//    public WeatherService getWeatherServiceBean() {
//        return null;
//    }
//
//    public String getWeather() {
//        return getWeatherServiceBean().getCurrentTemperature();
//    }


}
