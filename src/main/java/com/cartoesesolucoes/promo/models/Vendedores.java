package com.cartoesesolucoes.promo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.text.SimpleDateFormat;

@Entity
public class Vendedores {

    @Id
    @SequenceGenerator(name = "vendedores_seq",sequenceName = "vendedores_seq")
    @GeneratedValue(generator = "vendedores_seq")
    private Long id ;

    /** nome */
    @NotNull
    private String nome ="adm";
    /** pass */
    @NotNull
    private String pass ="adm";

    /** estado */
    @NotNull
    private Integer estado = 1 ;

    /** acesso */
    @NotNull
    private Integer acesso = 1 ;

    /** idinframa */
    @NotNull
    private Integer idinframa = 1 ;

    /** idempresa */
    @NotNull
    private Integer idempresa = 1 ;

    /** smsauto */
    @NotNull
    private Integer smsauto = 0 ;


    /** caminhoimagem */
    private String caminhoimagem ;

    /** uniqueid */
    private String uniqueid ;

    /** dataatualiza **/
    @NotNull
    @Pattern(regexp = "DD-MM-YYYY hh:mm:ss")
    private SimpleDateFormat dataatualiza = new SimpleDateFormat ("11-11-1111 00:00:00");

    /** nom_pro */
    private String nom_pro ;



    public Vendedores() {
        // constructor for JPA
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getAcesso() {
        return acesso;
    }

    public void setAcesso(Integer acesso) {
        this.acesso = acesso;
    }

    public Integer getIdinframa() {
        return idinframa;
    }

    public void setIdinframa(Integer idinframa) {
        this.idinframa = idinframa;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getSmsauto() {
        return smsauto;
    }

    public void setSmsauto(Integer smsauto) {
        this.smsauto = smsauto;
    }

    public String getCaminhoimagem() {
        return caminhoimagem;
    }

    public void setCaminhoimagem(String caminhoimagem) {
        this.caminhoimagem = caminhoimagem;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    public SimpleDateFormat getDataatualiza() { return dataatualiza;}

    public void setDataatualiza(SimpleDateFormat dataatualiza) { this.dataatualiza = dataatualiza;}

    public String getNom_pro() {
        return nom_pro;
    }

    public void setNom_pro(String nom_pro) {
        this.nom_pro = nom_pro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
