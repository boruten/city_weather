package com.example.city_weather.dao;

import com.example.city_weather.entity.Weather;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface WeatherRep extends CrudRepository<Weather,Long> {
    List<Weather> findByCityAndDate(String city, LocalDateTime date);
}
