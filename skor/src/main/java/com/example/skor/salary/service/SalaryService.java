package com.example.skor.salary.service;

import com.example.skor.salary.persistence.Salary;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SalaryService {

    public int getSalaryMultiplyer(int id) {
        return Salary.getById(id).getMultipyler();
    }

    public List<Salary> getAll(){
        return Salary.getAll();
    }

}
