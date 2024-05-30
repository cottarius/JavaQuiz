package ru.cotarius.javaquiz.dto;

import lombok.Data;
import ru.cotarius.javaquiz.entity.Question;
import ru.cotarius.javaquiz.entity.Quiz;

@Data
public class QuestionDto {
    private Long id;
    private String title;
    private String correctAnswer;
//    private Quiz quiz;
}
