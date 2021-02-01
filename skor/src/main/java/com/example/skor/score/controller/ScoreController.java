package com.example.skor.score.controller;


import com.example.skor.city.model.CityModel;
import com.example.skor.score.model.ScoreResponse;
import com.example.skor.score.service.ScoreService;
import com.example.skor.user.model.UserRecordModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("score/v1")
public class ScoreController {

    private final ScoreService scoreService;

    @PostMapping
    public ResponseEntity<ScoreResponse> score(@RequestBody UserRecordModel userRecordModel) {
        int score = scoreService.getScore(userRecordModel);
        return new ResponseEntity(ScoreResponse.builder().response(String.valueOf(score)).build(), HttpStatus.OK);
    }


}
