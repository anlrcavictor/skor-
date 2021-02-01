package com.example.skor.salary.controller;

import com.example.skor.salary.service.SalaryService;
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
@RequestMapping("salary/v1")
public class SalaryController {

    private final SalaryService salaryService;

    @GetMapping
    public ResponseEntity getAll() {
        List<ScoreResponse.ResultDTO> list = salaryService.getAll().stream().map(salary -> new ScoreResponse.ResultDTO(String.valueOf(salary.getId()), salary.getRange())).collect(Collectors.toList());
        return new ResponseEntity<ScoreResponse>( ScoreResponse.builder().resultList(list).build(), HttpStatus.OK);
    }

}
