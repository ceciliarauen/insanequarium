package br.com.meuaquario.aquarium.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meuaquario.aquarium.exception.PeixeNotFoundException;
import br.com.meuaquario.aquarium.models.Peixe;
import br.com.meuaquario.aquarium.repositories.PeixeRepo;

@Service
public class PeixeService {

	private final PeixeRepo peixeRepo;

	@Autowired
	PeixeService(PeixeRepo peixeRepo) {
		this.peixeRepo = peixeRepo;
	}

	public Peixe addPeixe(Peixe peixe) {		
		return peixeRepo.save(peixe);
	}

	public List<Peixe> findAllPeixes() {
		return peixeRepo.findAll();
	}

	public Peixe updatePeixe(Peixe peixe) {
		return peixeRepo.save(peixe);
	}

	public Peixe findPeixeById(Long id) {
		return peixeRepo.findPeixeById(id)
				.orElseThrow(()-> new PeixeNotFoundException("Peixe de id " + id + "Não foi encontrado"));
	}

	public void deletePeixe(Long id) {
		peixeRepo.deletePeixeById(id);
	}

}
