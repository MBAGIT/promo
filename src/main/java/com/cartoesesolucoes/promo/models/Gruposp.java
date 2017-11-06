package com.cartoesesolucoes.promo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Gruposp {

	@Id
	@SequenceGenerator(name = "gruposp_seq", sequenceName = "gruposp_seq")
	@GeneratedValue(generator = "gruposp_seq")
	private Long id;

	/** nome **/
	private String nome;

	/** obs **/
	private String obs;

	/** tipo **/
	@NotNull
	private String tipo = "Descontos";

	/** valor **/
	@NotNull
	private String valor = "0";
	
	/** idempresa **/
    private Integer idempresa = 1;

    /** activo */
	private Boolean activo = true;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the idempresa
	 */
	public Integer getIdempresa() {
		return idempresa;
	}

	/**
	 * @param idempresa the idempresa to set
	 */
	public void setIdempresa(Integer idempresa) {
		this.idempresa = idempresa;
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

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	/**
	 * @return the activo
	 */
	public Boolean getActivo() {
		return activo;
	}

	/**
	 * @param activo
	 *            the activo to set
	 */
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

}
