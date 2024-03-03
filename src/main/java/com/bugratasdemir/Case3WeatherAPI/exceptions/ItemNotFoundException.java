package com.bugratasdemir.Case3WeatherAPI.exceptions;

import com.bugratasdemir.Case3WeatherAPI.errormessage.BaseErrorMessage;
import com.bugratasdemir.Case3WeatherAPI.general.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ItemNotFoundException extends BusinessException {
    public ItemNotFoundException(BaseErrorMessage baseErrorMessage) {
        super(baseErrorMessage);
    }
}
