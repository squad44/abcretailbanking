package com.hcl.retailbanking.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="manage_payee")
public class ManagePayee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private long id;
	private String payee_name;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private long payee_account_number;

	private String customer_email_id;
	private int otp;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPayee_name() {
		return payee_name;
	}
	public void setPayee_name(String payee_name) {
		this.payee_name = payee_name;
	}
	public long getPayee_account_number() {
		return payee_account_number;
	}
	public void setPayee_account_number(long payee_account_number) {
		this.payee_account_number = payee_account_number;
	}
	public String getCustomer_email_id() {
		return customer_email_id;
	}
	public void setCustomer_email_id(String customer_email_id) {
		this.customer_email_id = customer_email_id;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}



}