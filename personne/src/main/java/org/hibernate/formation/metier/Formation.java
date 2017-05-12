package org.hibernate.formation.metier;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Formation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String theme;
	private Date dateDebut;
	private int duree;
	private Lieu lieu;
	private Set<Formateur> formateurs;
	
	public Set<Formateur> getFormateurs() {
		return formateurs;
	}


	public void setFormateurs(Set<Formateur> formateurs) {
		this.formateurs = formateurs;
	}


	public Long getId() {
		return id;
	}
	
	
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Formation(String theme, Date dateDebut, int duree, Lieu lieu, Set<Formateur> formateurs) {
		super();
		this.theme = theme;
		this.dateDebut = dateDebut;
		this.duree = duree;
		this.lieu = lieu;
		this.formateurs = formateurs;
	}


	public Formation(String theme, Date dateDebut, int duree, Lieu lieu) {
		super();
		this.theme = theme;
		this.dateDebut = dateDebut;
		this.duree = duree;
		this.lieu = lieu;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public Lieu getLieu() {
		return lieu;
	}
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
