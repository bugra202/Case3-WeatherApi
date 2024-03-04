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
    @Mapping(target = "region" ,source = "weatherApiDTO.body.location.region")
    @Mapping(target = "country" ,source = "weatherApiDTO.body.location.country")
    @Mapping(target = "lat" ,source = "weatherApiDTO.body.location.lat")
    @Mapping(target = "lon" ,source = "weatherApiDTO.body.location.lon")
    @Mapping(target = "tz_id" ,source = "weatherApiDTO.body.location.tz_id")
    @Mapping(target = "localtime_epoch" ,source = "weatherApiDTO.body.location.localtime_epoch")
    WeatherDTO convertToWeatherDTO(ResponseEntity<WeatherResponse> weatherApiDTO);


}
