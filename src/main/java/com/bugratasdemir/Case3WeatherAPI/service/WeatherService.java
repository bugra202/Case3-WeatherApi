package com.bugratasdemir.Case3WeatherAPI.service;

import com.bugratasdemir.Case3WeatherAPI.dto.WeatherDTO;

public interface WeatherService {
    WeatherDTO getWeeklyWeatherForecast(Long cityId);

}
