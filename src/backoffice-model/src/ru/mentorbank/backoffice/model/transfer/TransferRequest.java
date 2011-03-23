package ru.mentorbank.backoffice.model.transfer;

import java.io.Serializable;

public class TransferRequest implements Serializable{

	private static final long serialVersionUID = 1L;

	private AccountInfo srcAccount;
	
	private AccountInfo dstAccount;
	
	public AccountInfo getSrcAccount() {
		return srcAccount;
	}
	public void setSrcAccount(AccountInfo srcAccount) {
		this.srcAccount = srcAccount;
	}
	public AccountInfo getDstAccount() {
		return dstAccount;
	}
	public void setDstAccount(AccountInfo dstAccount) {
		this.dstAccount = dstAccount;
	}
	
	
}
