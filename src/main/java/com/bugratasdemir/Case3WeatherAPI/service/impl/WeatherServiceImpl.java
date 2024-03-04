package com.bugratasdemir.Case3WeatherAPI.service.impl;

import com.bugratasdemir.Case3WeatherAPI.client.WeatherApi;
import com.bugratasdemir.Case3WeatherAPI.dto.WeatherDTO;
import com.bugratasdemir.Case3WeatherAPI.dto.WeatherResponse;
import com.bugratasdemir.Case3WeatherAPI.entity.City;
import com.bugratasdemir.Case3WeatherAPI.general.BaseEntityService;
import com.bugratasdemir.Case3WeatherAPI.mapper.WeatherMapper;
import com.bugratasdemir.Case3WeatherAPI.repository.CityRepository;
import com.bugratasdemir.Case3WeatherAPI.service.WeatherService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class WeatherServiceImpl extends BaseEntityService<City, CityRepository> implements WeatherService {

    @Value("${apiKey}")
    private String apiKey;

    protected WeatherServiceImpl(CityRepository repository, WeatherApi weatherApi) {
        super(repository);
        this.weatherApi = weatherApi;
    }
    private final WeatherApi weatherApi;
    @Override
    public WeatherDTO getWeeklyWeatherForecast(Long cityId) {

        City city = findByIdWithControl(cityId);

        ResponseEntity<WeatherResponse> response = weatherApi.findByCityName(city.getCityName(),apiKey);

        return WeatherMapper.INSTANCE.convertToWeatherDTO(response);

    }

}
