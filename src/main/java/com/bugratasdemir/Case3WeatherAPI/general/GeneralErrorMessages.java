package com.bugratasdemir.Case3WeatherAPI.general;

import java.time.LocalDateTime;

public record GeneralErrorMessages(LocalDateTime date, String message, String description) {}
