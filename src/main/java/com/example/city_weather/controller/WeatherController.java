package com.example.city_weather.controller;

import com.example.city_weather.entity.Weather;
import com.example.city_weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Service
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public List<Weather> getTemp(@PathVariable String city){
        return  weatherService.findAndSaveWeatherData(city);
    }
    @GetMapping("/weather")
    public List<Weather> getAll() {
        return weatherService.findAll();
    }
}