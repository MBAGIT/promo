package com.cartoesesolucoes.promo.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

//@Entity
public class Produtos {
	
	@Id
    @SequenceGenerator(name = "produtos_seq",sequenceName = "produtos_seq")
    private Long id ;
	
	/** codigobarras **/
    @NotNull
    private String codigobarras = "0";
    
    /** descricao **/
    @NotNull
    private String descricao = "produto";
    
    /** marca **/
    private String marca;
    
    /** grupo **/
    @NotNull
    private Integer grupo = 1;
    
    /** preco **/
    @NotNull
    private String preco = "0";
    
    /** attivo **/
    private Integer attivo = 1;
    
    /** familia **/
    private String familia;
    
    /** subfamilia **/
    private String subfamilia;
    
    /** gama **/
    private String gama;
    
    /** especialidade **/
    private String especialidade;
    
    /** prateleira **/
    private String prateleira;
    
    /** categoria **/
    private String categoria;
    
    /** idempresa **/
    @NotNull
    private Integer idempresa = 1;
    
    /** desconto **/
    private double desconto;
    
    /** imagem **/
    @NotNull
    private String imagem = "";
    
    /** nome **/
    @NotNull
    private String nome = "teste";
    
    /** app **/
    @NotNull
    private boolean app = false;
    
    /** codigoed **/
    private String codigoed;
    
    /** String **/
    private String iva;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigobarras() {
		return codigobarras;
	}

	public void setCodigobarras(String codigobarras) {
		this.codigobarras = codigobarras;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getGrupo() {
		return grupo;
	}

	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public Integer getAttivo() {
		return attivo;
	}

	public void setAttivo(Integer attivo) {
		this.attivo = attivo;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getSubfamilia() {
		return subfamilia;
	}

	public void setSubfamilia(String subfamilia) {
		this.subfamilia = subfamilia;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(String prateleira) {
		this.prateleira = prateleira;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getIdempresa() {
		return idempresa;
	}

	public void setIdempresa(Integer idempresa) {
		this.idempresa = idempresa;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isApp() {
		return app;
	}

	public void setApp(boolean app) {
		this.app = app;
	}

	public String getCodigoed() {
		return codigoed;
	}

	public void setCodigoed(String codigoed) {
		this.codigoed = codigoed;
	}

	public String getIva() {
		return iva;
	}

	public void setIva(String iva) {
		this.iva = iva;
	}
    
    
}
