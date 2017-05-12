package org.hibernate.formation.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.formation.HibernateUtil;
import org.hibernate.formation.metier.Formateur;
import org.hibernate.formation.metier.Formation;
import org.hibernate.formation.metier.FormationInter;
import org.hibernate.formation.metier.FormationIntra;
import org.hibernate.formation.metier.Lieu;

public class FormationManager {
	
	private static Logger logger = Logger.getLogger(PersonneManager.class);
	public static void main(String[] args) {
		FormationManager mgr = new FormationManager();
		//mgr.createAndSorePeronne("BAH", "bah");
		mgr.insertion();
		//mgr.chargement();
	}
	public static void insertion(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Lieu lieu = new Lieu("lieu3","14 rue paul");
		//Lieu lieu = (Lieu) session.load(Lieu.class, new Long(1));
		Formateur formateur1 = new Formateur("formateur1", 2);
		Formateur formateur2 = new Formateur("formateur2", 3);
		Formateur formateur3 = new Formateur("ormateur3", 4);
		Set<Formateur> formateurs = new HashSet<Formateur>(3);
		formateurs.add(formateur1);
		formateurs.add(formateur2);
		formateurs.add(formateur3);
		Formation formation = new Formation("Angular", new Date(), 9, lieu, formateurs);
		FormationInter formationInter= new FormationInter("Spring", new Date(), 4, lieu, formateurs, 5);
		FormationIntra formationIntra = new FormationIntra("EJB3", new Date(), 3, lieu, formateurs, "FORT");
		//Long lieuId= (Long) session.save(lieu);
		//System.out.println("Cle primaire Lieu : "+ lieuId);
		
		Long FormationId= (Long) session.save(formation);
		System.out.println("Cle primaire formation : "+ FormationId);
		
		Long formationIntraId = (Long) session.save(formationIntra);
		System.out.println("FORMATION INTRA: "+ formationIntraId);
		
		Long formationInterId = (Long) session.save(formationInter);
		System.out.println("FORMATION INTER: "+ formationInterId);
		
		tx.commit();
		session.close();
	}
	public static void chargement(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Formation formation = (Formation) session.load(Formation.class, new Long(10));
		Set<Formateur>  formateurs = formation.getFormateurs();
		for(Formateur f:formateurs){
			System.out.println(f.getNom());
		}
		tx.commit();
		session.close();
	}
}
