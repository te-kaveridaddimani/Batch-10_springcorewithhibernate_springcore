package com.te.springcorewithhibernate.beanclass;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="BankDetails")
public class BankAccount  implements Serializable {

	
		@Column
		private String account1;
		@Column
		@Id
		private String account2;
		@OneToOne
		private Customer customer;
}
