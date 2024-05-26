package ru.cotarius.javaquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cotarius.javaquiz.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
