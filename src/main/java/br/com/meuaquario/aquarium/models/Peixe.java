package br.com.meuaquario.aquarium.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "peixe")
public class Peixe implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	@Column(unique = true)
	private String especie;
	private String ph;
	private String tpAgua;
	private float minVol;
	private int cardume;
	private String imageUrl;

	@ManyToOne
	@JoinColumn(name = "aquario_id")
	private Aquario aquario;

	public Peixe() {
	}

	public Peixe(String ph, String tpAgua, float minVol, int cardume, String imageUrl, Aquario aquario,
			String especie) {

		this.ph = ph;
		this.tpAgua = tpAgua;
		this.minVol = minVol;
		this.cardume = cardume;
		this.imageUrl = imageUrl;
		this.aquario = aquario;
		this.especie = especie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getTpAgua() {
		return tpAgua;
	}

	public void setTpAgua(String tpAgua) {
		this.tpAgua = tpAgua;
	}

	public float getMinVol() {
		return minVol;
	}

	public void setMinVol(float minVol) {
		this.minVol = minVol;
	}

	public int getCardume() {
		return cardume;
	}

	public void setCardume(int cardume) {
		this.cardume = cardume;
	}

	public Aquario getAquario() {
		return aquario;
	}

	public void setAquario(Aquario aquario) {
		this.aquario = aquario;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "Peixe [id=" + id + ", ph=" + ph + ", tpAgua=" + tpAgua + ", minVol=" + minVol + ", cardume=" + cardume
				+ ", imageUrl=" + imageUrl + ", aquario=" + aquario + "]";
	}

}
