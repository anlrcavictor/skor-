package com.example.skor.salary.persistence;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum Salary {

    ONE(1,"0-2999TL",800),
    TWO(2,"3000TL-2999TL",1000),
    THREE(3,"5000TL-7999TL",1200),
    FOR(4,"8000TL-11999TL",1500),
    FIVE(5,"12000TL-...",2000);

    private final Integer id;
    private final String range;
    private final Integer multipyler;

    public static Salary getById(int id) {
        return Arrays.stream(Salary.values()).filter(item -> item.id == id ).findAny().orElse(null);
    }

    public static List<Salary> getAll() {
        return Arrays.asList(Salary.values());
    }


}
