package com.springcorewithhibernate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcorewithhibernate.beanclass.Customer;

@Configuration
public class CustomerConfig {

	@Bean
	public Customer getCustomer() {

		Customer customer = new Customer();
		customer.setCid(1000);
		customer.setCname("naresh");

		return customer;
	}
}
