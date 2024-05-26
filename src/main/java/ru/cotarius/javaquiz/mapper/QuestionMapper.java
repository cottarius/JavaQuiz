package ru.cotarius.javaquiz.mapper;

import org.springframework.stereotype.Component;
import ru.cotarius.javaquiz.dto.QuestionDto;
import ru.cotarius.javaquiz.entity.Question;

import java.util.List;

@Component
public class QuestionMapper {

    public Question toQuestion(QuestionDto questionDto) {
        Question question = new Question();
        question.setTitle(questionDto.getTitle());
//        question.setQuiz(questionDto.getQuiz());
        return question;
    }

    public QuestionDto toQuestionDto(Question question) {
        QuestionDto questionDto = new QuestionDto();
        questionDto.setId(question.getId());
        questionDto.setTitle(question.getTitle());
//        questionDto.setQuiz(question.getQuiz());
        return questionDto;
    }

    public List<QuestionDto> toQuestionDtoList(List<Question> questions) {
        return questions.stream().map(this::toQuestionDto).toList();
    }

    public List<Question> toQuestionList(List<QuestionDto> questionDtos) {
        return questionDtos.stream().map(this::toQuestion).toList();
    }
}
