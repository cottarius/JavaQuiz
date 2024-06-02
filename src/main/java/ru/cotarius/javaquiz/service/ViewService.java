package ru.cotarius.javaquiz.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.cotarius.javaquiz.dto.AnswerDto;
import ru.cotarius.javaquiz.dto.QuestionDto;
import ru.cotarius.javaquiz.entity.Answer;
import ru.cotarius.javaquiz.entity.Question;
import ru.cotarius.javaquiz.mapper.AnswerMapper;
import ru.cotarius.javaquiz.mapper.QuestionMapper;
import ru.cotarius.javaquiz.repository.AnswerRepository;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class ViewService {
    private final QuestionService questionService;
    private final AnswerService answerService;
    private final Scanner scanner;
    private final Random random;
    private final AnswerRepository answerRepository;
    private final QuestionMapper questionMapper;
    private final AnswerMapper answerMapper;

    public Question getRandomQuestion(){
        long randomId = random.nextInt(questionService.findAll().size());
        QuestionDto questionDto = questionService.findById(randomId);
//        List<AnswerDto> answers = answerService.findByQuestionId(question.getId());
//        for (AnswerDto answer : answers) {
//            if (answer.isCorrect()) {
//                question.setCorrectAnswer(answer.getText());
//                break;
//            }
//        }
        return questionMapper.toQuestion(questionDto);
    }
    public List<Answer> getAnswers(Question question){
        long id = question.getId();
        return answerMapper.toAnswerList(answerService.findByQuestionId(id));
    }
}
