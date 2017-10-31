package com.cartoesesolucoes.promo.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotNull;


@Entity
public class Movimentos {



    @Id
    @SequenceGenerator(name = "movimentos_seq",sequenceName = "movimentos_seq")
    private Long id ;

    /** tipo**/
    @NotNull
    private String tipo = "Acumulação";
    
    /** data **/
    @NotNull
    @Pattern(regexp = "DD-MM-YYYY hh:mm:ss")
    private SimpleDateFormat  data = new SimpleDateFormat ("11-11-1111 00:00:00");

    /** idcliente **/
    @NotNull
    private Integer idcliente = 0;
    
    /** vendedor **/
    @NotNull
    private Integer vendedor = 1;
    
    /** total **/
    @NotNull
    private String total = "0";
    
    
    /** desconto **/
    @NotNull
    private String desconto = "0";
    
    
    /** obs **/
    @NotNull
    private String obs;
    
    
    /** total_venda **/
    @NotNull
    private String total_venda = "0";
    
    /** activo **/
    @NotNull
    private Integer activo = 1;

    /** idempresa **/
    @NotNull
    private Integer idempresa = 1;
    
    /** idass **/
    @NotNull
    private Integer idass = -1;
    
    /** ponto **/
    @NotNull
    private Integer ponto = 0;
    
    /** acumulado **/
    @NotNull
    private String acumulado = "0";
    
    /** retirado **/
    @NotNull
    private String retirado = "0";
    
    /** ndoc **/
    private String ndoc;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public SimpleDateFormat getData() {
		return data;
	}

	public void setData(SimpleDateFormat data) {
		this.data = data;
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public Integer getVendedor() {
		return vendedor;
	}

	public void setVendedor(Integer vendedor) {
		this.vendedor = vendedor;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getDesconto() {
		return desconto;
	}

	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getTotal_venda() {
		return total_venda;
	}

	public void setTotal_venda(String total_venda) {
		this.total_venda = total_venda;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Integer getIdempresa() {
		return idempresa;
	}

	public void setIdempresa(Integer idempresa) {
		this.idempresa = idempresa;
	}

	public Integer getIdass() {
		return idass;
	}

	public void setIdass(Integer idass) {
		this.idass = idass;
	}

	public Integer getPonto() {
		return ponto;
	}

	public void setPonto(Integer ponto) {
		this.ponto = ponto;
	}

	public String getAcumulado() {
		return acumulado;
	}

	public void setAcumulado(String acumulado) {
		this.acumulado = acumulado;
	}

	public String getRetirado() {
		return retirado;
	}

	public void setRetirado(String retirado) {
		this.retirado = retirado;
	}

	public String getNdoc() {
		return ndoc;
	}

	public void setNdoc(String ndoc) {
		this.ndoc = ndoc;
	}
    
    
}
