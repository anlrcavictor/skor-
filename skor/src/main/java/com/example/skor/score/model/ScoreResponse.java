package com.example.skor.score.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties
@Builder
public class ScoreResponse {

    private String response;

    private List<ResultDTO> resultList;


    @Data
    @AllArgsConstructor
    public static class ResultDTO {

        private String id;

        private String text;

}

}
