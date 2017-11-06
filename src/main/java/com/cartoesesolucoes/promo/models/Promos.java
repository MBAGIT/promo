package com.cartoesesolucoes.promo.models;

import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Promos {

	@Id
	@SequenceGenerator(name = "promos_seq", sequenceName = "promos_seq")
	@GeneratedValue(generator = "promos_seq")
	private Long id;

	@NotNull
	@Pattern(regexp = "DD/MM/YYYY")
	private SimpleDateFormat inicio = new SimpleDateFormat("11/11/1111");

	@NotNull
	@Pattern(regexp = "DD/MM/YYYY")
	private SimpleDateFormat fim = new SimpleDateFormat("11/11/1111");

	/** desconto **/
	@NotNull
	private String desconto = "0";

	/** descricao_tipo **/
	private String descricao_tipo;

	/** idgrupo **/
	private Long idgrupo;

	/** nprodutos **/
	private Long nprodutos;

	/** ativo **/
	@NotNull
	private boolean ativo = false;

	/** marca **/
	private String marca;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SimpleDateFormat getInicio() {
		return inicio;
	}

	public void setInicio(SimpleDateFormat inicio) {
		this.inicio = inicio;
	}

	public SimpleDateFormat getFim() {
		return fim;
	}

	public void setFim(SimpleDateFormat fim) {
		this.fim = fim;
	}

	public String getDesconto() {
		return desconto;
	}

	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}

	public String getDescricao_tipo() {
		return descricao_tipo;
	}

	public void setDescricao_tipo(String descricao_tipo) {
		this.descricao_tipo = descricao_tipo;
	}

	public Long getIdgrupo() {
		return idgrupo;
	}

	public void setIdgrupo(Long idgrupo) {
		this.idgrupo = idgrupo;
	}

	public Long getNprodutos() {
		return nprodutos;
	}

	public void setNprodutos(Long nprodutos) {
		this.nprodutos = nprodutos;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
