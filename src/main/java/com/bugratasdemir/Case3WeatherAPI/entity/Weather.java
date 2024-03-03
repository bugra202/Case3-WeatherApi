package com.bugratasdemir.Case3WeatherAPI.entity;

import com.bugratasdemir.Case3WeatherAPI.general.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "WEATHER")
public class Weather extends BaseEntity {

    @SequenceGenerator(name = "sequenceGenerator",sequenceName = "S_WEATHER",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequenceGenerator")
    @Column(name = "ID")
    @Id
    private Long id;
}
