package org.hibernate.formation.metier;

import java.io.Serializable;

public class Formateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long Id;
	private String nom;
	private Integer anneeExperience;
	
	
	public Formateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Formateur( String nom, Integer anneeExperience) {
		super();
		this.nom = nom;
		this.anneeExperience = anneeExperience;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getAnneeExperience() {
		return anneeExperience;
	}
	public void setAnneeExperience(Integer anneeExperience) {
		this.anneeExperience = anneeExperience;
	}

		
}
