package com.cartoesesolucoes.promo.models;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Gruposcp {

	@Id
	@SequenceGenerator(name = "gruposcp_seq", sequenceName = "gruposcp_seq")
	@GeneratedValue(generator = "gruposcp_seq")
	private Long id;

	@ManyToOne
	private Gruposp gruposp;

	@ManyToOne
	private Gruposc gruposc;

	/** valor **/
	@NotNull
	private String valor = "0";

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


	public Gruposp getGruposp() {
		return gruposp;
	}

	public void setGruposp(Gruposp gruposp) {
		this.gruposp = gruposp;
	}

	public Gruposc getGruposc() {
		return gruposc;
	}

	public void setGruposc(Gruposc gruposc) {
		this.gruposc = gruposc;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

}
