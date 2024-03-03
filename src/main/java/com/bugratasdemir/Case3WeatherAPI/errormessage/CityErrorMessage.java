package com.bugratasdemir.Case3WeatherAPI.errormessage;

import lombok.Getter;

@Getter
public enum CityErrorMessage implements BaseErrorMessage{

    CITY_NOT_FOUND("City not found!");
    private final String message;

    CityErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
