package br.com.meuaquario.aquarium.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aquario")
public class Aquario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long idAquario;
	
	@Column(unique = true)
	private String nome;
	private String tpAgua;
	private float profundidade;
	private float largura;
	private float altura;
	private float vol;
	private String imageUrl;
	
	@OneToMany
	@JoinColumn(name = "aquario_id")
	private List<Peixe> peixe;

	public Aquario() {
	}

	

	public Aquario(String nome, String tpAgua, float profundidade, float largura, float altura, float vol,
			String imageUrl) {		
		this.nome = nome;
		this.tpAgua = tpAgua;
		this.profundidade = profundidade;
		this.largura = largura;
		this.altura = altura;
		this.vol = vol;
		this.imageUrl = imageUrl;
	}

	

	public Long getIdAquario() {
		return idAquario;
	}

	public void setIdAquario(Long idAquario) {
		this.idAquario = idAquario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTpAgua() {
		return tpAgua;
	}

	public void setTpAgua(String tpAgua) {
		this.tpAgua = tpAgua;
	}

	public float getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(float profundidade) {
		this.profundidade = profundidade;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getVol() {		
		return vol;
	}

	public void setVol(float vol) {
		this.vol = vol;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	

	
		
	
}
