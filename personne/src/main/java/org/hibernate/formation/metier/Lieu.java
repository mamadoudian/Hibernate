package org.hibernate.formation.metier;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Lieu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nom;
	private String adresse;

	
	public Lieu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lieu(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}
