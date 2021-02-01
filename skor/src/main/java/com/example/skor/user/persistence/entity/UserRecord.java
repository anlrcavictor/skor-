package com.example.skor.user.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserRecord {

    @Id
    @Column
    private String id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private Integer cityCode;

    @Column
    private Integer salaryId;

    @Column
    private String phoneNumber;

    @Column
    private Integer score;

    @Column
    private Date date;





}
