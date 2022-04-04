package br.com.meuaquario.aquarium.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meuaquario.aquarium.models.Aquario;
import br.com.meuaquario.aquarium.models.Peixe;
import br.com.meuaquario.aquarium.services.AquarioService;

@CrossOrigin("*")
@Transactional
@RestController
@RequestMapping("/aquarios")
public class AquarioController {

	private final AquarioService aquarioService;

	@Autowired
	AquarioController(AquarioService aquarioService) {
		this.aquarioService = aquarioService;
	}

	@GetMapping("/")
	public ResponseEntity<List<Aquario>> getAllAquarios() {
		List<Aquario> aquarios = aquarioService.findAllAquarios();
		return new ResponseEntity<>(aquarios, HttpStatus.OK);
	}
	
		
	@GetMapping("/{id}")
	public ResponseEntity<Aquario> getAquarioById(@PathVariable("id") Long idAquario) {
		Aquario aquario = aquarioService.findByIdAquario(idAquario);
		return new ResponseEntity<>(aquario, HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<Aquario> addAquario(@RequestBody Aquario aquario) {
		Aquario newAquario = aquarioService.addAquario(aquario);
		return new ResponseEntity<>(newAquario, HttpStatus.CREATED);

	}

	@PutMapping("/")
	public ResponseEntity<Aquario> updateAquario(@RequestBody Aquario aquario) {
		Aquario updateAquario = aquarioService.updateAquario(aquario);
		return new ResponseEntity<>(updateAquario, HttpStatus.OK);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteAquario(@PathVariable("id") Long idAquario) {
		aquarioService.deleteAquario(idAquario);
		return new ResponseEntity<>(HttpStatus.OK);

	}
	
}
