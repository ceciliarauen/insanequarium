package br.com.meuaquario.aquarium.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PeixeAquario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int quantidade;
	@ManyToOne
	private Aquario aquario;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Peixe peixe;
	
	public PeixeAquario() {

	}
	
	

	public PeixeAquario(Aquario aquario, Peixe peixe, int quantidade) {
		this.aquario = aquario;
		this.peixe = peixe;
		this.quantidade = quantidade;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aquario getAquario() {
		return aquario;
	}

	public void setAquario(Aquario aquario) {
		this.aquario = aquario;
	}

	public Peixe getPeixe() {
		return peixe;
	}

	public void setPeixe(Peixe peixe) {
		this.peixe = peixe;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}