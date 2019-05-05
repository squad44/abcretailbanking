package com.hcl.retailbanking.pojos;

import java.util.Date;

public class CustomerCreation {
	
	private long CustomerId;
	private String customer_name;
	private Date customer_dob;
	private long customer_phone_number;
	private String account_type;
	private double balance;
	
	public long getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(long customerId) {
		CustomerId = customerId;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public Date getCustomer_dob() {
		return customer_dob;
	}
	public void setCustomer_dob(Date customer_dob) {
		this.customer_dob = customer_dob;
	}
	public long getCustomer_phone_number() {
		return customer_phone_number;
	}
	public void setCustomer_phone_number(long customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "CustomerCreation [customer_name=" + customer_name + ", customer_dob=" + customer_dob
				+ ", customer_phone_number=" + customer_phone_number + ", account_type=" + account_type + ", balance="
				+ balance + "]";
	}

}
