package com.exemplo.heranca.hibernate.repository;

import com.exemplo.heranca.hibernate.model.Aluno;
import com.exemplo.heranca.hibernate.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    @Query(value = "select e from com.exemplo.heranca.hibernate.model.Pessoa e")
    List<Pessoa> getPessoa();
}
