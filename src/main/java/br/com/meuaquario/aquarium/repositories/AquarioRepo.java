package br.com.meuaquario.aquarium.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meuaquario.aquarium.models.Aquario;

public interface AquarioRepo extends JpaRepository<Aquario, Long>{

	Optional<Aquario> findByIdAquario(Long idAquario);

	void deleteByIdAquario(Long idAquario);

}
