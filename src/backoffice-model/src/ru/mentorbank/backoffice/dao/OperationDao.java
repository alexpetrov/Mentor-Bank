package ru.mentorbank.backoffice.dao;

import java.util.Set;

import ru.mentorbank.backoffice.dao.exception.OperationDaoException;
import ru.mentorbank.backoffice.model.Operation;

public interface OperationDao {
	public void saveOperation(Operation operation) throws OperationDaoException;
	public Set<Operation> getOperations() throws OperationDaoException;
}
