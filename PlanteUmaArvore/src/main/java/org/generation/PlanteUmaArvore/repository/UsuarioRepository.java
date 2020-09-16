package org.generation.PlanteUmaArvore.repository;

import java.util.Optional;

import org.generation.PlanteUmaArvore.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	
	public Optional<Usuario>findByEmail(String UserName);

}
