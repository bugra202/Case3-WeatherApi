package com.bugratasdemir.Case3WeatherAPI.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse {

    @JsonProperty("location")
    private Location location;

    @Getter
    @Setter
    public static class Location {
        private String name;
        private String region;
        private String country;
        private Double lat;
        private Double lon;
        private String tz_id;
        private Long localtime_epoch;
        private String localtime;
    }
}

