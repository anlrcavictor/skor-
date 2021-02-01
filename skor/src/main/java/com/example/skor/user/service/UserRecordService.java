package com.example.skor.user.service;

import com.example.skor.user.persistence.entity.UserRecord;
import com.example.skor.user.persistence.exception.UserRecordNotFoundException;
import com.example.skor.user.persistence.repository.UserRecordRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserRecordService {

    private final UserRecordRepository userRecordRepository;

    public UserRecord findUserRecord(String id) {
        return userRecordRepository.findById(id).orElseThrow(() -> new UserRecordNotFoundException("UserRecord not found " + id));
    }

    public void save(UserRecord userRecord) {
        userRecordRepository.save(userRecord);
    }
}
