package ru.cotarius.javaquiz.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.cotarius.javaquiz.dto.AnswerDto;
import ru.cotarius.javaquiz.dto.QuestionDto;
import ru.cotarius.javaquiz.entity.Question;
import ru.cotarius.javaquiz.mapper.QuestionMapper;
import ru.cotarius.javaquiz.repository.QuestionRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    public QuestionDto findById(Long id) {
        Question question = questionRepository.findById(id).orElse(null);
        if (question == null) {
            throw new NoSuchElementException("Question not found");
        }
        return questionMapper.toQuestionDto(question);
    }

//    public List<AnswerDto> findAnswers(Long questionId) {
//
//    }
}
