package ru.cotarius.javaquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cotarius.javaquiz.entity.Answer;
import ru.cotarius.javaquiz.entity.Question;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
