package ru.cotarius.javaquiz.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "question")
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

//    @ManyToOne
//    @JoinColumn(name = "quiz_id")
//    private Quiz quiz;
}

