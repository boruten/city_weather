package com.example.city_weather.entity;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "weather")
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String country;
    private String city;
    private Double temperature;
    private LocalDateTime time;

    public Weather(String country, String city, Double temperature, LocalDateTime time) {
        this.country = country;
        this.city = city;
        this.temperature = temperature;
        this.time = time;
    }

    public Weather() {
    }

    public Long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public Double getTemperature() {
        return temperature;
    }


    public LocalDateTime getTime() {
        return time;
    }
    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", temperature='" + temperature + '\'' +
                ", tine='" + time + '\'' +
                '}';
    }
}


