package ru.mentorbank.backoffice.services.moneytransfer;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ru.mentorbank.backoffice.services.moneytransfer.exceptions.TransferException;
import ru.mentorbank.backoffice.test.AbstractSpringTest;

public class MoneyTransferServiceBeanTest extends AbstractSpringTest {

	@Autowired
	private MoneyTransferServiceBean moneyTransferService;
	
	@Test
	public void transfer() throws TransferException{
		fail("not implemented yet");
		//TODO: use mock object to test indirect output
		moneyTransferService.transfer(null);
	}
	
	@Test
	public void transfer_failsWithUnsatisfiedBalance() throws TransferException{
		fail("not implemented yet");
		//TODO: create test for expected exception TransferException
	}
	@Test
	public void transfer_failsWithAskSecurityStopListStatus() throws TransferException{
		fail("not implemented yet");
		//TODO: create test for expected exception TransferException
	}
}
