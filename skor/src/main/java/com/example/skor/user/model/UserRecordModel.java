package com.example.skor.user.model;

import com.example.skor.user.persistence.entity.UserRecord;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
public class UserRecordModel {

    private String id;
    private String name;
    private String surname;
    private String cityCode;
    private String salaryId;
    private String phoneNumber;



    public UserRecord mapUserRecord(int score) {
        return new UserRecord(
                this.id,
                this.name,
                this.surname,
                Integer.valueOf(this.cityCode),
                Integer.valueOf(this.salaryId),
                this.phoneNumber,
                score,
                new Date());
    }

}
