package ru.cotarius.javaquiz.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "module")
@Data
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
}
