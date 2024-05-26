package ru.cotarius.javaquiz.mapper;

import org.springframework.stereotype.Component;
import ru.cotarius.javaquiz.dto.AnswerDto;
import ru.cotarius.javaquiz.entity.Answer;
import ru.cotarius.javaquiz.entity.Question;

import java.util.List;

@Component
public class AnswerMapper {

    public Answer toAnswer(AnswerDto answerDto) {
        Answer answer = new Answer();
        answer.setText(answerDto.getText());
        answer.setCorrect(answerDto.isCorrect());
        answer.setQuestion(answerDto.getQuestion());
        return answer;
    }

    public AnswerDto toAnswerDto(Answer answer) {
        AnswerDto answerDto = new AnswerDto();
        answerDto.setId(answer.getId());
        answerDto.setText(answer.getText());
        answerDto.setCorrect(answer.isCorrect());
        answerDto.setQuestion(answer.getQuestion());
        return answerDto;
    }

    public List<AnswerDto> toAnswerDtoList(List<Answer> answers) {
        return answers.stream().map(this::toAnswerDto).toList();
    }

    public List<AnswerDto> toAnswerDtoList(List<Answer> answers, List<Question> questions) {
        return answers.stream().map(this::toAnswerDto).toList();
    }
}
