package br.com.meuaquario.aquarium.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meuaquario.aquarium.models.Peixe;

public interface PeixeRepo extends JpaRepository<Peixe, Long> {

	void deletePeixeById(Long id);

	Optional<Peixe> findPeixeById(Long id);


	
	
}
