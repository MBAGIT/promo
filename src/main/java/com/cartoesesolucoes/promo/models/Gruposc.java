package com.cartoesesolucoes.promo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Gruposc {

	@Id
	@SequenceGenerator(name = "gruposc_seq", sequenceName = "gruposc_seq")
	@GeneratedValue(generator = "gruposc_seq")
	private Long id;

	/** nome **/
	private String nome;

	/** obs **/
	private String obs;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the obs
	 */
	public String getObs() {
		return obs;
	}

	/**
	 * @param obs
	 *            the obs to set
	 */
	public void setObs(String obs) {
		this.obs = obs;
	}

}
