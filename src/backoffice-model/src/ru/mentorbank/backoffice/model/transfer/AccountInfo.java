package ru.mentorbank.backoffice.model.transfer;

import java.io.Serializable;

public class AccountInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	private String accountNumber;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}
