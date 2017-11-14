package com.cartoesesolucoes.promo.models;

import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import javax.persistence.ForeignKey;

@Entity
public class Promos_prods {

	@Id
	@SequenceGenerator(name = "promos_prods_seq", sequenceName = "promos_prods_seq")
	@GeneratedValue(generator = "promos_prods_seq")
	private Long id;

	@ManyToOne
	private Promos promo ;
	
	@ManyToOne
	private Produtos produtos;

    
	private String descricao; 
		
	private String codigo;
	
	@NotNull
    private String preco = "0";

}
