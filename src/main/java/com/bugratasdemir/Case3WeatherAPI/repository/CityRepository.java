package com.bugratasdemir.Case3WeatherAPI.repository;

import com.bugratasdemir.Case3WeatherAPI.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
