package com.example.skor.segment.service;

import com.example.skor.segment.validation.ScoreSegmentValidation;
import com.example.skor.util.MathUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ScoreSegmentService {

    private final ScoreSegmentValidation scoreSegmentValidation;

    public int getScore(String idNumber) {
        scoreSegmentValidation.validateIdNumber(idNumber);
        log.info("id Number is : {}", idNumber);
        return MathUtil.getRandom(9);
    }
}
