package it.milleidee.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Type;



/**
 * The persistent class for the mi_lana database table.
 * 
 */
@Entity
@Table(name="mi_lana")

public class Lana implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	private Integer id;

	private String composizione;

	private Integer grammi;

	private String marca;

	private Double prezzo;
	
	private String image;

	public Lana() {
	}

	@Id
	@GeneratedValue
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComposizione() {
		return this.composizione;
	}

	public void setComposizione(String composizione) {
		this.composizione = composizione;
	}

	public Integer getGrammi() {
		return this.grammi;
	}

	public void setGrammi(Integer grammi) {
		this.grammi = grammi;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrezzo() {
		return this.prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


	
	

}