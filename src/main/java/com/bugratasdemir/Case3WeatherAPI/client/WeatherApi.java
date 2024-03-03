package com.bugratasdemir.Case3WeatherAPI.client;

import com.bugratasdemir.Case3WeatherAPI.dto.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "weather", url = "http://api.weatherapi.com/v1/current.json")
public interface WeatherApi {

    @GetMapping
    ResponseEntity<WeatherResponse> findByCityName(@RequestParam("q") String q, @RequestParam("key") String key);

}
