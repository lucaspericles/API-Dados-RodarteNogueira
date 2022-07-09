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
    private Character sexo;
    private LocalDate datanascimento;
    private Float nota1;
    private Float nota2;
    private Float nota3;

    public AlunoModel(Long id, String nome, Character sexo, LocalDate datanascimento, Float nota1, Float nota2, Float nota3) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.datanascimento = datanascimento;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public AlunoModel() {

    }

    public AlunoModel(long id, String nome, String sexo, LocalDate datanascimento) {
    }

    public AlunoModel(long id, String nome, String sexo) {
    }
}
