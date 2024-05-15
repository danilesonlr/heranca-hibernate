package com.exemplo.heranca.hibernate.service;

import com.exemplo.heranca.hibernate.model.Aluno;
import com.exemplo.heranca.hibernate.model.Pessoa;
import com.exemplo.heranca.hibernate.model.Professor;
import com.exemplo.heranca.hibernate.repository.AlunoRepository;
import com.exemplo.heranca.hibernate.repository.ProfessorRepository;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HerancaService {
    private AlunoRepository alunoRepository;
    private ProfessorRepository professorRepository;

    private EntityManager entityManager;

    public HerancaService(AlunoRepository alunoRepository,
                          ProfessorRepository professorRepository,
                          EntityManager entityManager){
        this.alunoRepository = alunoRepository;
        this.professorRepository = professorRepository;
        this.entityManager = entityManager;
    }

    public void popularBanco(){
        Aluno aluno =  new Aluno();
        aluno.setTurma("A");
        aluno.setNome("Nome Aluno");
        aluno.setIdade(10);
        aluno.setContexto("Aluno");

        Professor professor = new Professor();
        professor.setMateria("Português");
        professor.setNome("Nome Professor");
        professor.setIdade(33);
        professor.setContexto("Professor");


        alunoRepository.save(aluno);
        professorRepository.save(professor);
    }

    public List<Pessoa> getDados(){
        //TODO: Pode ser criado dentro do repositorio passando a SuperClasse
        //return alunoRepository.getPessoa();
        //TODO: Ou pode ser instanciado uma EntityManager e criar a JPQL
        return entityManager.createQuery("FROM com.exemplo.heranca.hibernate.model.Pessoa", Pessoa.class).getResultList();
    }

}
