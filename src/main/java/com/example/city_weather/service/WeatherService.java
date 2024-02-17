package com.example.city_weather.service;

import com.example.city_weather.entity.Weather;

import java.time.LocalDateTime;
import java.util.List;

public interface WeatherService {


    public List<Weather> findAndSaveWeatherData(String city);

    List<Weather> findByCityAndTime(String city, LocalDateTime time);

    List<Weather> findAll();
}

