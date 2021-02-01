package com.example.skor.user.persistence.repository;

import com.example.skor.user.persistence.entity.UserRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRecordRepository extends CrudRepository<UserRecord, String> {

    Optional<UserRecord> findById(String id);

}
