package org.generation.PlanteUmaArvore.repository;

import java.util.List;

import org.generation.PlanteUmaArvore.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem> findAllByDescricaoContainingIgnoreCase (String descricao);
}
