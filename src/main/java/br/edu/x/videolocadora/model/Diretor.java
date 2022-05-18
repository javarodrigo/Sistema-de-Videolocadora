package br.edu.x.videolocadora.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Diretor {
    
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	@ManyToMany
	@JoinTable(name = "FILME_DIRETOR",
	        joinColumns = @JoinColumn(name = "diretor_id"),
	        inverseJoinColumns = @JoinColumn(name = "filme_id")
	)
	private Collection<Filme> diretores = new ArrayList<>();
}
