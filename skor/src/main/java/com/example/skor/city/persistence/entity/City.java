package com.example.skor.city.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @Column
    private Integer cityCode;

    @Column
    private String cityName;

    @Column
    private Integer cityScore;


}
