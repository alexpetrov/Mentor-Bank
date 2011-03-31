package ru.mentorbank.backoffice.services.moneytransfer.exceptions;

public class TransferException extends Exception {

	public String message;
	
	public TransferException(String message) {
		this.message = message;
	}

	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
