package com.example.skor.city.service;

import com.example.skor.city.model.CityModel;
import com.example.skor.city.persistence.entity.City;
import com.example.skor.city.persistence.exception.CityNotFoundException;
import com.example.skor.city.persistence.repository.CityRepository;
import com.example.skor.util.MathUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    public int getCityScore(int cityCode) {
        return cityRepository.findById(cityCode).map(City::getCityScore).orElseThrow(() -> new CityNotFoundException("City not found " + cityCode));
    }

    public List<CityModel> getCities() {
        return cityRepository.findAll().stream().map(CityModel::new).collect(Collectors.toList());
    }

}
