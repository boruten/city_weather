package com.example.city_weather.scheduled;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@EnableScheduling
@Component
public class CityScheduler {
    @Value("${cities.list}")
    private String[] cities;

    @Scheduled(fixedRate = 10000)
    public void printCities() {
        for (String city : cities) {
            System.out.println(city);
        }
    }
    @PostConstruct
    public void onStartup() {
        printCities();
    }

}
