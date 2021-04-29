package com.te.springcorewithhibernate.method;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcorewithhibernate.config.EntityMngerFactoryConfig;

public class Update {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EntityMngerFactoryConfig.class);
		
		EntityManagerFactory  entitymanagerfactory  =  context.getBean(EntityManagerFactory.class);
		    
		       EntityManager entitymanager  =  entitymanagerfactory.createEntityManager();
		       
		              EntityTransaction transaction =    entitymanager.getTransaction();
		              
		              transaction.begin();	
		              String query = "update Customer set cname=:xyz where cid=:id";
		                Query issuedquery =   entitymanager.createQuery(query);
		                issuedquery.setParameter("xyz", "sonya");
		                issuedquery.setParameter("id", 3000);
		               int count =  issuedquery.executeUpdate();
		               System.out.println("number of rows affected  is "+count);		              
		              transaction.commit();

	}

}
