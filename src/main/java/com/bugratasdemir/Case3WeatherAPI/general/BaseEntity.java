package com.bugratasdemir.Case3WeatherAPI.general;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements BaseModel{

    @Embedded
    private BaseAdditionalFields baseAdditionalFields;
    @Version
    @Column(columnDefinition = "bigint default 0")
    private Long version = 0L;
}