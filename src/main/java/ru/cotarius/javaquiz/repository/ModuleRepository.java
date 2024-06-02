package ru.cotarius.javaquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cotarius.javaquiz.entity.Module;

public interface ModuleRepository extends JpaRepository<Module, Long> {
}
