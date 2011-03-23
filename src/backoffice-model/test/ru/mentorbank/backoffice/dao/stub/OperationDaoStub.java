package ru.mentorbank.backoffice.dao.stub;

import java.util.HashSet;
import java.util.Set;

import ru.mentorbank.backoffice.dao.OperationDao;
import ru.mentorbank.backoffice.dao.exception.OperationDaoException;
import ru.mentorbank.backoffice.model.Operation;
import ru.mentorbank.backoffice.model.stoplist.StopListInfo;
import ru.mentorbank.backoffice.model.stoplist.StopListStatus;

public class OperationDaoStub implements OperationDao {

	@Override
	public void saveOperation(Operation operation) throws OperationDaoException {
		

	}

	@Override
	public Set<Operation> getOperations() throws OperationDaoException {
		Set<Operation> result = new HashSet<Operation>();
		Operation operation = new Operation();
		StopListInfo dstStoplistInfo = new StopListInfo();
		dstStoplistInfo.setStatus(StopListStatus.ASKSECURITY);
		operation.setDstStoplistInfo(dstStoplistInfo );
		result.add(operation);
		return result;
	}

}
