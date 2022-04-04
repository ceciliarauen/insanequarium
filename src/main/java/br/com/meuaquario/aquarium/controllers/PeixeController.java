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

import br.com.meuaquario.aquarium.models.Peixe;
import br.com.meuaquario.aquarium.services.PeixeService;

@CrossOrigin("*")
@Transactional
@RestController
@RequestMapping("/peixes")
public class PeixeController {

	private final PeixeService peixeService;

	@Autowired
	PeixeController(PeixeService peixeService) {
		this.peixeService = peixeService;
	}

	@GetMapping("/")
	public ResponseEntity<List<Peixe>> getAllPeixes() {
		List<Peixe> peixes = peixeService.findAllPeixes();
		return new ResponseEntity<>(peixes, HttpStatus.OK);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Peixe> getPeixeById(@PathVariable("id") Long id) {
		Peixe peixe = peixeService.findPeixeById(id);
		return new ResponseEntity<>(peixe, HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<Peixe> addPeixe(@RequestBody Peixe peixe) {
		Peixe newPeixe = peixeService.addPeixe(peixe);
		return new ResponseEntity<>(newPeixe, HttpStatus.CREATED);

	}

	@PutMapping("/")
	public ResponseEntity<Peixe> updatePeixe(@RequestBody Peixe peixe) {
		Peixe updatePeixe = peixeService.updatePeixe(peixe);
		return new ResponseEntity<>(updatePeixe, HttpStatus.OK);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePeixe(@PathVariable("id") Long id) {
		peixeService.deletePeixe(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}
}

