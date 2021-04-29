package com.te.springcorewithhibernate.method;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcorewithhibernate.config.EntityMngerFactoryConfig;
import com.te.springcorewithhibernate.beanclass.Customer;

public class GetClass {

	public static void main(String[] args) {
		
			ApplicationContext context = new AnnotationConfigApplicationContext(EntityMngerFactoryConfig.class);
					
					EntityManagerFactory  entitymanagerfactory  =  context.getBean(EntityManagerFactory.class);
					    
					       EntityManager entitymanager  =  entitymanagerfactory.createEntityManager();
					       
					              EntityTransaction transaction =    entitymanager.getTransaction();
					              
					              transaction.begin();	
					              String query = " from Customer";
					                Query issuedquery =   entitymanager.createQuery(query);
					         List<Customer> customer =    issuedquery.getResultList();
					         transaction.commit();
					         
					         
							for(Customer cu: customer)
					         {
					        	 System.out.println(cu.getCid());
					        	 System.out.println(cu.getCname());
					        	 System.out.println(cu.getBankAccount().getAccount1());
					        	 System.out.println(cu.getBankAccount().getAccount2());
					        	
					         }

	}

}
