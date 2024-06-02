package ru.cotarius.javaquiz.dto;

import lombok.Data;

@Data
public class QuestionDto {
    private Long id;
    private String title;
    private String correctAnswer;
//    private Quiz quiz;
}
