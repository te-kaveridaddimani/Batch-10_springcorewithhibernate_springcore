package com.te.springcorewithhibernate.beanclass;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
@Entity
@Table(name = "customerDetails")
public class Customer implements Serializable {

	@Id
	@Column
	private int cid;

	@Column
	private String cname;

	@Autowired(required = false)
	@OneToOne
	private BankAccount bankAccount;
}
