package com.example.skor.segment.validation;

import com.example.skor.segment.validation.exception.UnSuitableIdException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Component
@RequiredArgsConstructor
public class ScoreSegmentValidation {

    public void validateIdNumber(String idNumber) {
        if(idNumber.startsWith("0"))
            throw new UnSuitableIdException("Boyle Bir TC Kimlik No Bulunmuyor");
    }
}
