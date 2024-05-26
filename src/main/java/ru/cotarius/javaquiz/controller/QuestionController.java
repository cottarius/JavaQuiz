package ru.cotarius.javaquiz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.cotarius.javaquiz.dto.AnswerDto;
import ru.cotarius.javaquiz.dto.QuestionDto;
import ru.cotarius.javaquiz.entity.Answer;
import ru.cotarius.javaquiz.entity.Question;
import ru.cotarius.javaquiz.service.AnswerService;
import ru.cotarius.javaquiz.service.QuestionService;

import java.util.List;
import java.util.Random;

@Controller
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;
    private final AnswerService answerService;
    private final Random random;

    @GetMapping("/question")
    public String getQuestionById(Model model) {
        List<Question> questions = questionService.findAll();
        long id = random.nextInt(1, questions.size() + 1);
        QuestionDto question = questionService.findById(id);
        List<AnswerDto> answers = answerService.findByQuestionId(question.getId());
        model.addAttribute("question", question);
        model.addAttribute("answers", answers);
        return "question";
    }
}
