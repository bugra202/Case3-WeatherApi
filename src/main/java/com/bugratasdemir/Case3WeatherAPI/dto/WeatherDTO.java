package com.bugratasdemir.Case3WeatherAPI.dto;

public record WeatherDTO(String name,
                         String region,
                         String country,
                         double lat,
                         double lon,
                         String tz_id,
                         Long localtime_epoch) {}
