package br.edu.x.videolocadora.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Fita {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Boolean danificada;
	
	private Boolean disponivel;
	
	@ManyToOne
	@JoinColumn(name="filme_id")
	private Filme filme;
}
