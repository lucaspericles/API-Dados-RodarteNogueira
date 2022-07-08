package br.com.rodartenogueira.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "aluno")
@Getter @Setter @ToString
public class AlunoModel {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;
    private Character Sexo;
    private LocalDate datanascimento;
    private Float nota1;
    private Float nota2;
    private Float nota3;
}
