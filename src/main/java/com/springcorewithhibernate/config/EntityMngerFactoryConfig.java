package com.springcorewithhibernate.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class EntityMngerFactoryConfig {

	@Bean
	public EntityManagerFactory getEntity()
	{
	 return Persistence.createEntityManagerFactory("hibernate");
	}
}
