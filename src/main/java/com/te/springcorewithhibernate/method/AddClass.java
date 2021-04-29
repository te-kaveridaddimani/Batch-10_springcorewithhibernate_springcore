package com.te.springcorewithhibernate.method;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcorewithhibernate.config.EntityMngerFactoryConfig;
import com.te.springcorewithhibernate.beanclass.BankAccount;
import com.te.springcorewithhibernate.beanclass.Customer;

public class AddClass {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccount1("mysorebank");
		bankAccount.setAccount2("kvg");
		
		
		Customer customer = new Customer();
		customer.setCid(3000);
		customer.setCname("dinga");
		
		customer.setBankAccount(bankAccount);
		bankAccount.setCustomer(customer);
		
		
ApplicationContext context = new AnnotationConfigApplicationContext(EntityMngerFactoryConfig.class);
		
		EntityManagerFactory  entitymanagerfactory  =  context.getBean(EntityManagerFactory.class);
		    
		       EntityManager entitymanager  =  entitymanagerfactory.createEntityManager();
		       
		              EntityTransaction transaction =    entitymanager.getTransaction();
		              
		              transaction.begin();	
		              entitymanager.persist(customer);
		              entitymanager.persist(bankAccount);
		              transaction.commit();
		              System.out.println("sucessfully added the customer information");

	}

}
