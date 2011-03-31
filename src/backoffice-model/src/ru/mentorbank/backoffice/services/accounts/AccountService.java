package ru.mentorbank.backoffice.services.accounts;

import ru.mentorbank.backoffice.model.transfer.AccountInfo;

public interface AccountService {

	public boolean verifyBalance(AccountInfo account);
}
