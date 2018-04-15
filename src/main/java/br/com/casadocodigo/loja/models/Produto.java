package br.com.casadocodigo.loja.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Produto {
	
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String descricao;
	private int paginas;
	
	@ElementCollection
	private List<Preco> precos;
	
	private String sumarioPath;


}
