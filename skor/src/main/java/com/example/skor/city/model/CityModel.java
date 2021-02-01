package com.example.skor.city.model;

import com.example.skor.city.persistence.entity.City;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;



@Data
@Builder
@AllArgsConstructor
public class CityModel {

    private String cityCode;

    private String name;

    public CityModel(City city) {
         this.cityCode = String.valueOf(city.getCityCode());
         this.name =  city.getCityName();
    }

}
