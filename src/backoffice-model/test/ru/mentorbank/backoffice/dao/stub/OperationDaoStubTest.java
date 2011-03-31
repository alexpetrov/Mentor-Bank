package ru.mentorbank.backoffice.dao.stub;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ru.mentorbank.backoffice.dao.OperationDao;
import ru.mentorbank.backoffice.dao.exception.OperationDaoException;
import ru.mentorbank.backoffice.model.Operation;
import ru.mentorbank.backoffice.model.stoplist.StopListStatus;
import ru.mentorbank.backoffice.test.AbstractSpringTest;

public class OperationDaoStubTest extends AbstractSpringTest {

	@Autowired
	public OperationDao operationDao;

	@Test
	public void getOperations() throws OperationDaoException {
		Set<Operation> operaions = operationDao.getOperations();
		assertOperationsAreInAskSequrityStatus(operaions);
	}

	private void assertOperationsAreInAskSequrityStatus(Set<Operation> operaions) {
		assertNotNull(operaions);
		for (Operation operation : operaions) {
			if (StopListStatus.ASKSECURITY != operation.getDstStoplistInfo()
					.getStatus()) {
				fail("Статус операций должен быть ASKSECURITY");
			}
		}
	}
}
