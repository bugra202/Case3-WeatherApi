package com.bugratasdemir.Case3WeatherAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Case3WeatherApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Case3WeatherApiApplication.class, args);
	}

}
