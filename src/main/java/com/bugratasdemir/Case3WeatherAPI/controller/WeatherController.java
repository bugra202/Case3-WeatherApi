package com.bugratasdemir.Case3WeatherAPI.controller;

import com.bugratasdemir.Case3WeatherAPI.dto.WeatherDTO;
import com.bugratasdemir.Case3WeatherAPI.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weathers")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/{id}")
    public ResponseEntity<WeatherDTO> getWeeklyWeatherForecast(@PathVariable Long id){
        WeatherDTO weatherDTO = weatherService.getWeeklyWeatherForecast(id);
        return ResponseEntity.ok(weatherDTO);
    }
}
