package ru.mentorbank.backoffice.services.moneytransfer;

import ru.mentorbank.backoffice.model.transfer.TransferRequest;
import ru.mentorbank.backoffice.services.moneytransfer.exceptions.TransferException;

public interface MoneyTransferService {

	public void transfer(TransferRequest request) throws TransferException;
}
