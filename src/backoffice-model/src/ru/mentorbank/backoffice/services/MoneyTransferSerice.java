package ru.mentorbank.backoffice.services;

import ru.mentorbank.backoffice.model.transfer.TransferRequest;
import ru.mentorbank.backoffice.services.exceptions.TransferException;

public interface MoneyTransferSerice {

	public void transfer(TransferRequest request) throws TransferException;
}
