package ru.mentorbank.backoffice.services.moneytransfer;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;

import ru.mentorbank.backoffice.model.transfer.AccountInfo;
import ru.mentorbank.backoffice.model.transfer.TransferRequest;
import ru.mentorbank.backoffice.services.accounts.AccountService;
import ru.mentorbank.backoffice.services.accounts.AccountServiceBean;
import ru.mentorbank.backoffice.services.moneytransfer.exceptions.TransferException;
import ru.mentorbank.backoffice.test.AbstractSpringTest;

public class MoneyTransferServiceFailsOnLowBalanceTest extends
		AbstractSpringTest {

	@Autowired
	private MoneyTransferServiceBean moneyTransferService;
	private AccountService mockedAccountService;
	private AccountInfo lowBalancedAccount;
	private TransferRequest transferRequest;

	@Before
	public void setUp() {
		mockedAccountService = mock(AccountServiceBean.class);
		lowBalancedAccount = new AccountInfo();
		lowBalancedAccount.setAccountNumber("111111111111111");
		transferRequest = new TransferRequest();
		transferRequest.setSrcAccount(lowBalancedAccount);
	}

	@Test
	@ExpectedException(TransferException.class)
	public void transfer_failsWithUnsatisfiedBalance() throws TransferException {
		// Закомментированный код показывает, как выглядел бы тест,
		// если бы не было аннотации Expected Exception
		// try {
		// set up SUT
		when(mockedAccountService.verifyBalance(lowBalancedAccount))
				.thenReturn(false);
		((MoneyTransferServiceBean) moneyTransferService)
				.setAccountService(mockedAccountService);
		// call SUT
		moneyTransferService.transfer(transferRequest);
		// verify
		fail("Should throw TransferException, because of low balance in src account");
		// } catch (TransferException e) {
		// e.printStackTrace();
		// assertEquals(MoneyTransferServiceBean.LOW_BALANCE_ERROR_MESSAGE,
		// e.getMessage());
		// }
	}
}
