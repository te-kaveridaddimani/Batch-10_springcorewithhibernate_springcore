package com.te.springcorewithhibernate.method;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcorewithhibernate.config.EntityMngerFactoryConfig;
import com.te.springcorewithhibernate.beanclass.Customer;

public class DeleteClass {

	public static void main(String[] args) {

	ApplicationContext context = new AnnotationConfigApplicationContext(EntityMngerFactoryConfig.class);
	
	EntityManagerFactory  entitymanagerfactory  =  context.getBean(EntityManagerFactory.class);
	    
	       EntityManager entitymanager  =  entitymanagerfactory.createEntityManager();
	       
	              EntityTransaction transaction =    entitymanager.getTransaction();
	              
	              transaction.begin();	
	           Customer customer =    entitymanager.find(Customer.class,1001);
	         entitymanager.remove(customer);	
	         transaction.commit();	
	         System.out.println("sucessfully deleted");
}
}