package br.com.meuaquario.aquarium.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meuaquario.aquarium.exception.AquarioNotFoundException;
import br.com.meuaquario.aquarium.models.Aquario;
import br.com.meuaquario.aquarium.repositories.AquarioRepo;

@Service
public class AquarioService {

	private final AquarioRepo aquarioRepo;

	@Autowired
	AquarioService(AquarioRepo aquarioRepo) {
		this.aquarioRepo = aquarioRepo;

	}

	public Aquario addAquario(Aquario aquario) {
		aquario.setVol(aquario.getAltura() * aquario.getLargura() * aquario.getProfundidade() / 1000);
		return aquarioRepo.save(aquario);
	}

	public List<Aquario> findAllAquarios() {
		return aquarioRepo.findAll();
	}

	public Aquario updateAquario(Aquario aquario) {
		aquario.setVol(aquario.getAltura() * aquario.getLargura() * aquario.getProfundidade() / 1000);
		return aquarioRepo.save(aquario);
	}

	public Aquario findByIdAquario(Long idAquario) {
		return aquarioRepo.findByIdAquario(idAquario)
				.orElseThrow(() -> new AquarioNotFoundException("Aquario de id " + idAquario + "Não foi encontrado"));

	}

	public void deleteAquario(Long idAquario) {
		aquarioRepo.deleteByIdAquario(idAquario);
	}

}
