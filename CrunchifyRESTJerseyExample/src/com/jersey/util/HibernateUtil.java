package com.jersey.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.jersey.model.Employee;

public class HibernateUtil {
	private static SessionFactory factory; 
	static {
		try{
        factory = new AnnotationConfiguration().
                  configure().
                  buildSessionFactory();
	     }catch (Throwable ex) { 
	        System.err.println("Failed to create sessionFactory object." + ex);
	        throw new ExceptionInInitializerError(ex); 
	     }
	}
	public static SessionFactory getSessionFactory() {
        return factory;
    }
}
