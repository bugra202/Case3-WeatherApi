package com.bugratasdemir.Case3WeatherAPI.entity;

import com.bugratasdemir.Case3WeatherAPI.general.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CITY")
public class City extends BaseEntity {

    @SequenceGenerator(name = "sequenceGenerator",sequenceName = "S_CITY",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequenceGenerator")
    @Column(name = "ID")
    @Id
    private Long id;

    @Column(name = "CITY_NAME",length = 200,nullable = false)
    private String cityName;

    @Column(name = "CITY_ID",length = 200,nullable = false)
    private Long cityId;

    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;

}
