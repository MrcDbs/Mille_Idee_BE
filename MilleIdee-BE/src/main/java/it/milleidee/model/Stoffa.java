package it.milleidee.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mi_stoffa database table.
 * 
 */
@Entity
@Table(name="mi_stoffa")

public class Stoffa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String colore;

	private Double prezzo;

	public Stoffa() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColore() {
		return this.colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public Double getPrezzo() {
		return this.prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

}