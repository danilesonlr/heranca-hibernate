package com.exemplo.heranca.hibernate.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno extends Pessoa{
    private String turma;
}
