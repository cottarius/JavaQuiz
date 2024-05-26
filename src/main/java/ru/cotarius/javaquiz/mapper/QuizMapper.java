package ru.cotarius.javaquiz.mapper;

import org.springframework.stereotype.Component;
import ru.cotarius.javaquiz.dto.QuizDto;
import ru.cotarius.javaquiz.entity.Quiz;

import java.util.List;

@Component
public class QuizMapper {

    public Quiz toQuiz(QuizDto quizDto) {
        Quiz quiz = new Quiz();
        quiz.setTitle(quizDto.getTitle());
        return quiz;
    }

    public QuizDto toQuizDto(Quiz quiz) {
        QuizDto quizDto = new QuizDto();
        quizDto.setId(quiz.getId());
        quizDto.setTitle(quiz.getTitle());
        return quizDto;
    }

    public List<QuizDto> toQuizDtoList(List<Quiz> quizList) {
        return quizList.stream().map(this::toQuizDto).toList();
    }

    public List<Quiz> toQuizList(List<QuizDto> quizDtoList) {
        return quizDtoList.stream().map(this::toQuiz).toList();
    }
}
