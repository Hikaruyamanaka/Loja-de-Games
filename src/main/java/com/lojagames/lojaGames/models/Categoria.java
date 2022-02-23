package com.lojagames.lojaGames.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name= "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	 
	@NotNull
    @Size(min = 10, max = 500)
	private String tipo;
	
	
	
	
	
}