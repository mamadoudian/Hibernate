package org.hibernate.formation.metier;

import java.io.Serializable;

public class Adresse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String adr1;
	private String adr2;
	private String codepostale;
	private String ville;
	private String pays;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAdr1() {
		return adr1;
	}
	public void setAdr1(String adr1) {
		this.adr1 = adr1;
	}
	public String getAdr2() {
		return adr2;
	}
	public void setAdr2(String adr2) {
		this.adr2 = adr2;
	}
	public String getCodepostale() {
		return codepostale;
	}
	public void setCodepostale(String codepostale) {
		this.codepostale = codepostale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
}
