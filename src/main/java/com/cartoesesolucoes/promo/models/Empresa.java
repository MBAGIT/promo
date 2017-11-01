package com.cartoesesolucoes.promo.models;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Empresa {

    @Id
    @SequenceGenerator(name = "empresas_seq",sequenceName = "empresas_seq")
    private Long id ;
    
    
    /** nome **/
    @NotNull
    private String nome = "empresa";
    
    /** activo **/
    @NotNull
    private Integer activo = 1;
    
    /** zona **/
    @NotNull
    private String zona = "";
    
    /** latitude **/
    @NotNull
    private Integer latitude = 0;
    
    /** longitude **/
    @NotNull
    private Integer longitude = 0;
    
    /** morada **/
    @NotNull
    private String morada = "";
    
    /** email **/
    @Email
    @NotNull
    private String email = "";
    
    /** telefone **/
    @NotNull
    private String telefone = "";
    
    /** loginsms **/
    @NotNull
    private String loginsms = "exemplo";
    
    /** passwordsms **/
    @NotNull
    private String passwordsms = "exemplo";
    
    /** sendersms **/
    @NotNull
    private String sendersms = "exemplo";
    
    /** imagem **/
    @NotNull
    private String imagem = "";
    
    /** token **/
    @NotNull
    private String token = "";
    
    /** uniqueid **/
    @NotNull
    private String uniqueid = "";

	public Empresa() {
		// default condtructor for jpa
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public Integer getLatitude() {
		return latitude;
	}

	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	public Integer getLongitude() {
		return longitude;
	}

	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLoginsms() {
		return loginsms;
	}

	public void setLoginsms(String loginsms) {
		this.loginsms = loginsms;
	}

	public String getPasswordsms() {
		return passwordsms;
	}

	public void setPasswordsms(String passwordsms) {
		this.passwordsms = passwordsms;
	}

	public String getSendersms() {
		return sendersms;
	}

	public void setSendersms(String sendersms) {
		this.sendersms = sendersms;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUniqueid() {
		return uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
