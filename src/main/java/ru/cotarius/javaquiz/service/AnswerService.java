package ru.cotarius.javaquiz.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.cotarius.javaquiz.dto.AnswerDto;
import ru.cotarius.javaquiz.entity.Answer;
import ru.cotarius.javaquiz.entity.Question;
import ru.cotarius.javaquiz.mapper.AnswerMapper;
import ru.cotarius.javaquiz.repository.AnswerRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;
    private final AnswerMapper answerMapper;

    public List<AnswerDto> findByQuestionId(Long questionId) {
        List<Answer> answers = answerRepository.findByQuestionId(questionId);
        if (answers == null) {
            throw new NoSuchElementException("Answer not found");
        }
        return answerMapper.toAnswerDtoList(answers);
    }
}
