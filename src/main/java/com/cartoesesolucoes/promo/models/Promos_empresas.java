package com.cartoesesolucoes.promo.models;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Promos_empresas {

	@Id
	@SequenceGenerator(name = "promos_empresas_seq", sequenceName = "promos_empresas_seq")
	@GeneratedValue(generator = "promos_empresas_seq")
	private Long id;

	@OneToMany(mappedBy = "id")
	private List<Promos> promos;

	@OneToMany(mappedBy = "id")
	private List<Empresa> empresas;

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
	 * @return the promos
	 */
	public List<Promos> getPromos() {
		return promos;
	}

	/**
	 * @param promos
	 *            the promos to set
	 */
	public void setPromos(List<Promos> promos) {
		this.promos = promos;
	}

	/**
	 * @return the empresas
	 */
	public List<Empresa> getEmpresas() {
		return empresas;
	}

	/**
	 * @param empresas
	 *            the empresas to set
	 */
	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

}
