package com.exemplo.heranca.hibernate.repository;

import com.exemplo.heranca.hibernate.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
