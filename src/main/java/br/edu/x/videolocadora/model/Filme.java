package br.edu.x.videolocadora.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Filme {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String titulo;
	
	private String genero;
	
	private String duracao;
	
	//@ManyToOne
	//@JoinColumn(name="tipodefilme_id")
	//private TipoDeFilme tipoDeFilme;
	
	//@NotNull(message = "O filme deve possuir pelo menos um Diretor")
	@ManyToMany
	@JoinTable(name = "FILME_DIRETOR",
	        joinColumns = @JoinColumn(name = "filme_id"),
	        inverseJoinColumns = @JoinColumn(name = "diretor_id")
	)
	private Collection<Diretor> diretores = new ArrayList<>();
}

