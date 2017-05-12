package org.hibernate.formation.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.formation.HibernateUtil;
import org.hibernate.formation.metier.Adresse;
import org.hibernate.formation.metier.Personne;
import org.hibernate.stat.Statistics;



public class PersonneManager {
	private static Logger logger = Logger.getLogger(PersonneManager.class);
	public static void main(String[] args) {
		PersonneManager mgr = new PersonneManager();
		//mgr.createAndSorePeronne("BAH", "bah");
		mgr.getPersonnes();
	}
	public void createAndSorePeronne(String nom,String prenom){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Statistics stat = HibernateUtil.getSessionFactory().getStatistics();
		Transaction t = session.beginTransaction();
		Personne p = new Personne();
		Adresse a = new Adresse();
		a.setAdr1("adr1");
		a.setAdr2("adr2");
		a.setPays("France");
		a.setVille("Rennes");
		a.setCodepostale("35700");
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setAdresse(a);
		session.save(p);
		t.commit();
		session.close();
		stat.logSummary();
	}
	
	public void getPersonnes(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Statistics stat = HibernateUtil.getSessionFactory().getStatistics();
		stat.setStatisticsEnabled(true);
		Transaction t = session.beginTransaction();
		List<Personne> personnes = session.createQuery("from Personne").list();
		for(Personne p : personnes){
			System.out.println(p.getNom());
		}
		t.commit();
		stat.logSummary();
		session.close();
		
	}

}
