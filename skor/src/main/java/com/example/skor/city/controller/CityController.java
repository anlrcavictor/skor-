package com.example.skor.city.controller;

import com.example.skor.city.service.CityService;
import com.example.skor.score.model.ScoreResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("city/v1")
public class CityController {

    private final CityService cityService;

    @GetMapping
    public ResponseEntity<ScoreResponse> getCities() {
        List<ScoreResponse.ResultDTO> list = cityService.getCities().stream().map(city -> new ScoreResponse.ResultDTO(city.getCityCode(), city.getName())).collect(Collectors.toList());
        return new ResponseEntity<ScoreResponse>( ScoreResponse.builder().resultList(list).build(), HttpStatus.OK);
    }


}
