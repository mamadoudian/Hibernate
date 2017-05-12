package org.hibernate.formation.metier;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class FormationIntra extends Formation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String niveaupersonnalisaionSupports;
	
	
	public FormationIntra() {
		super();
	}

	public FormationIntra(String theme, Date dateDebut, int duree, Lieu lieu, Set<Formateur> formateurs,String niveaupersonnalisaionSupports) {
		super(theme, dateDebut, duree, lieu, formateurs);
		this.niveaupersonnalisaionSupports = niveaupersonnalisaionSupports;
	}

	public FormationIntra(String niveaupersonnalisaionSupports) {
		
		this.niveaupersonnalisaionSupports = niveaupersonnalisaionSupports;
	}

	public String getNiveaupersonnalisaionSupports() {
		return niveaupersonnalisaionSupports;
	}

	public void setNiveaupersonnalisaionSupports(String niveaupersonnalisaionSupports) {
		this.niveaupersonnalisaionSupports = niveaupersonnalisaionSupports;
	}

}
