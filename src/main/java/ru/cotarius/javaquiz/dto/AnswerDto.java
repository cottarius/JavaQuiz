package ru.cotarius.javaquiz.dto;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import ru.cotarius.javaquiz.entity.Question;

@Data
public class AnswerDto {
    private Long id;
    private String text;
    private boolean isCorrect;
    private Question question;
}
