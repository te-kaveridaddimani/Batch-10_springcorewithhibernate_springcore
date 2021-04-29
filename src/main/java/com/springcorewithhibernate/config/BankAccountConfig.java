package com.springcorewithhibernate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcorewithhibernate.beanclass.BankAccount;

@Configuration
public class BankAccountConfig {
	@Bean
	public BankAccount getBankAccount() {
		BankAccount bankAccount  = new BankAccount();
		bankAccount.setAccount1("ICIC");
		bankAccount.setAccount2("SBI");
		return bankAccount ;
}
}