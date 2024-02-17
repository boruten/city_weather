package com.example.city_weather;


import com.example.city_weather.scheduled.CityScheduler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CityWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityWeatherApplication.class, args);
	}
}
