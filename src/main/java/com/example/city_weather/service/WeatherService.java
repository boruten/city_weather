package com.example.city_weather.service;

import com.example.city_weather.entity.Weather;

import java.time.LocalDateTime;
import java.util.List;

public interface WeatherService {


    public void findAndSaveWeatherData(String city);

    Weather findByCityAndDate(String city, LocalDateTime data);

    List<Weather> findAll();
}
