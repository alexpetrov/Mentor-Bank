package ru.mentorbank.backoffice.model.stoplist;

import java.io.Serializable;

public class StopListItem implements Serializable {
	private static final long serialVersionUID = 1L;

	private StopListStatus status;

	private String accountNumber;

	public StopListStatus getStatus() {
		return status;
	}

	public void setStatus(StopListStatus status) {
		this.status = status;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}
