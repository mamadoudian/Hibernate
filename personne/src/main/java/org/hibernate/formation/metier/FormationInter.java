package org.hibernate.formation.metier;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class FormationInter extends Formation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int nbEntreprises;

	
	public FormationInter() {
		super();
	}

	public FormationInter(String theme, Date dateDebut, int duree, Lieu lieu, Set<Formateur> formateurs, int nbEntreprises) {
		super(theme, dateDebut, duree, lieu,formateurs);
		this.nbEntreprises=nbEntreprises;
	}

	public FormationInter(int nbEntreprises) {
		super();
		this.nbEntreprises= nbEntreprises;
	}

	public int getNbEntreprises() {
		return nbEntreprises;
	}

	public void setNbEntreprises(int nbEntreprises) {
		this.nbEntreprises = nbEntreprises;
	}
	

}
