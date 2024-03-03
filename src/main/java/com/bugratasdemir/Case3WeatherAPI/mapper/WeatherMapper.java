package com.bugratasdemir.Case3WeatherAPI.mapper;

import com.bugratasdemir.Case3WeatherAPI.dto.WeatherDTO;
import com.bugratasdemir.Case3WeatherAPI.dto.WeatherResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WeatherMapper {
    WeatherMapper INSTANCE = Mappers.getMapper(WeatherMapper.class);
    @Mapping(target = "name" ,source = "weatherApiDTO.body.location.name")
    WeatherDTO convertToWeatherDTO(ResponseEntity<WeatherResponse> weatherApiDTO);


}
