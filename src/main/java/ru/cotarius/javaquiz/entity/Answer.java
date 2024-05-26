package ru.cotarius.javaquiz.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "answer")
@Data
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    private boolean isCorrect;
}
