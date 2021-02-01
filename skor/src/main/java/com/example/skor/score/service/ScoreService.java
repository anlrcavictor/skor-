package com.example.skor.score.service;

import com.example.skor.city.service.CityService;
import com.example.skor.salary.service.SalaryService;
import com.example.skor.segment.service.ScoreSegmentService;
import com.example.skor.user.model.UserRecordModel;
import com.example.skor.user.service.UserRecordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ScoreService {

    private final ScoreSegmentService scoreSegmentService;

    private final CityService cityService;

    private final SalaryService salaryService;

    private final UserRecordService userRecordService;

    public int getScore(UserRecordModel userRecordModel)  {
        int result=0;
        int segmentScore = scoreSegmentService.getScore(userRecordModel.getId());
        int cityScore = cityService.getCityScore(Integer.valueOf(userRecordModel.getCityCode()));
        int salaryMultiplier= salaryService.getSalaryMultiplyer(Integer.valueOf(userRecordModel.getSalaryId()));
        result = segmentScore * salaryMultiplier + cityScore;
        userRecordService.save(userRecordModel.mapUserRecord(result));
        return result;
    }


}
