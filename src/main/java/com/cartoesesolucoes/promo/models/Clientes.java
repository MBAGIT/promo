package com.cartoesesolucoes.promo.models;


import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class Clientes {


    @Id
    @SequenceGenerator (name = "clientes_seq",sequenceName = "clientes_seq")
    private Long idCliente ;

    /** codigo **/
    @NotNull
    private String codigo = "0";

    /** nome **/
    @NotNull
    private String nome ="test";

    /** apelido **/
    private String apelido;

    /** morada **/
    private String morada;

    /** numtlm **/
    private String numtlm;

    /** apelido **/
    private String numtlf;

    /** email **/
    @Email
    private String email;

    /** obs **/
    private String obs;

    /** profissao **/
    private String profissao;

    /** dataregisto **/
    @NotNull
    @Pattern (regexp = "DD-MM-YYYY")
    private Date dataregisto;

    /** pontos **/
    @NotNull
    private String pontos = "0";

    /** descontos **/
    @NotNull
    private String descontos = "0";

    /** giftcard **/
    @NotNull
    private String giftcard = "0";

    /** vendedor **/
    @NotNull
    private Integer vendedor =1;

    /** sexo **/
    @NotNull
    private String sexo = "Masculino";

    /** activo **/
    private Integer activo = 1;

    /** localidade **/
    private String localidade;

    /** codpostal **/
    @NotNull
    private String codpostal = "1111-111";

    /** idempresa **/
    private Integer idempresa = 1;

    /** cont **/
    private String cont;

    /** leites **/
    @NotNull
    private String leites="0";

    /** id_gru **/
    @NotNull
    private Integer id_gru=1;

    /** push **/
    @NotNull
    private Boolean push = false;

    /** password **/
    @NotNull
    private String password = "";

    /** registo_app **/
    private String registo_app;

    /** farmacia **/
    @NotNull
    private String farmacia ="";

    /** app **/
    @NotNull
    private Boolean app = false;

    /** marketingativo **/
    @NotNull
    private Boolean marketingativo = true;

    /** seguro **/
    @NotNull
    private String seguro="0";

    /** datanascimento **/
    private String indicador;

    /** indicador **/
    @NotNull
    @Pattern (regexp = "DD-MM-YYYY")
    private Date datanascimento;

    /**
     * Default condtructor For JPA
     */
    public Clientes( ) {

    }



    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNumtlm() {
        return numtlm;
    }

    public void setNumtlm(String numtlm) {
        this.numtlm = numtlm;
    }

    public String getNumtlf() {
        return numtlf;
    }

    public void setNumtlf(String numtlf) {
        this.numtlf = numtlf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Date getDataregisto() {
        return dataregisto;
    }

    public void setDataregisto(Date dataregisto) {
        this.dataregisto = dataregisto;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }

    public String getDescontos() {
        return descontos;
    }

    public void setDescontos(String descontos) {
        this.descontos = descontos;
    }

    public String getGiftcard() {
        return giftcard;
    }

    public void setGiftcard(String giftcard) {
        this.giftcard = giftcard;
    }

    public Integer getVendedor() {
        return vendedor;
    }

    public void setVendedor(Integer vendedor) {
        this.vendedor = vendedor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getLeites() {
        return leites;
    }

    public void setLeites(String leites) {
        this.leites = leites;
    }

    public Integer getId_gru() {
        return id_gru;
    }

    public void setId_gru(Integer id_gru) {
        this.id_gru = id_gru;
    }

    public Boolean getPush() {
        return push;
    }

    public void setPush(Boolean push) {
        this.push = push;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegisto_app() {
        return registo_app;
    }

    public void setRegisto_app(String registo_app) {
        this.registo_app = registo_app;
    }

    public String getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(String farmacia) {
        this.farmacia = farmacia;
    }

    public Boolean getApp() {
        return app;
    }

    public void setApp(Boolean app) {
        this.app = app;
    }

    public Boolean getMarketingativo() {
        return marketingativo;
    }

    public void setMarketingativo(Boolean marketingativo) {
        this.marketingativo = marketingativo;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }
}
