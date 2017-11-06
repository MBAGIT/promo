package com.cartoesesolucoes.promo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Gruposcp {

	@Id
	@SequenceGenerator(name = "gruposcp_seq", sequenceName = "gruposcp_seq")
	@GeneratedValue(generator = "gruposcp_seq")
	private Long id;

	@OneToMany(mappedBy = "id")
	private List<Gruposp> gruposp;

	@OneToMany(mappedBy = "id")
	private List<Gruposc> gruposc;

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

	

	/**
	 * @return the gruposp
	 */
	public List<Gruposp> getGruposp() {
		return gruposp;
	}

	/**
	 * @param gruposp the gruposp to set
	 */
	public void setGruposp(List<Gruposp> gruposp) {
		this.gruposp = gruposp;
	}

	/**
	 * @return the gruposc
	 */
	public List<Gruposc> getGruposc() {
		return gruposc;
	}

	/**
	 * @param gruposc the gruposc to set
	 */
	public void setGruposc(List<Gruposc> gruposc) {
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
