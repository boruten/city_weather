package com.example.city_weather.service;
import com.example.city_weather.dao.WeatherRep;
import com.example.city_weather.entity.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class WeatherServiceImp implements WeatherService {

    @Value("${weather.api.key}")
    private String weatherApiKey;

    @Value("${weather.api.url}")
    private String weatherApiUrl;

    private final RestTemplate restTemplate;
    private final WeatherRep weatherRep;


    @Autowired
    public WeatherServiceImp(WeatherRep weatherRep, RestTemplate restTemplate) {
        this.weatherRep = weatherRep;
        this.restTemplate = restTemplate;
    }

    public List<Weather> findAndSaveWeatherData(String city) {
        String apiUrl = weatherApiUrl + "?city=" + city + "&apiKey=" + weatherApiKey;
        Weather weather = restTemplate.getForObject(apiUrl, Weather.class);
        if (weather != null) {
            weatherRep.save(weather);
            return List.of(weather);
        }
        throw new IllegalArgumentException("Weather data not found for the city and date");
    }

    @Override
    public List<Weather> findAll() {
        return (List<Weather>) weatherRep.findAll();
    }


    @Override
    public List<Weather> findByCityAndTime(String city, LocalDateTime time) {
        return weatherRep.findByCityAndTime(city, time);
    }
}

