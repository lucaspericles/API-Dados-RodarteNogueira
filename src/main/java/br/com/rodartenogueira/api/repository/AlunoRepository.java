package br.com.rodartenogueira.api.repository;

import br.com.rodartenogueira.api.model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
}
