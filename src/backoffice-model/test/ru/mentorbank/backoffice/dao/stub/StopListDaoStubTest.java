package ru.mentorbank.backoffice.dao.stub;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ru.mentorbank.backoffice.model.stoplist.JuridicalStopListRequest;
import ru.mentorbank.backoffice.model.stoplist.StopListInfo;
import ru.mentorbank.backoffice.model.stoplist.StopListStatus;
import ru.mentorbank.backoffice.test.AbstractSpringTest;



public class StopListDaoStubTest extends AbstractSpringTest{

	@Autowired
	private StopListDaoStub stopListDao;
	private JuridicalStopListRequest stopListRequest;
	
	@Before
	public void setUp(){		
		stopListRequest = new JuridicalStopListRequest();
	}
	
	@Test
	public void getJuridicalStopListInfo_OK(){
		//setup SUT
		stopListRequest.setInn(StopListDaoStub.INN_FOR_OK_STATUS);
		// Call SUT
		StopListInfo info = stopListDao.getJuridicalStopListInfo(stopListRequest);
		// Validate SUT
		Assert.assertNotNull("Информация должна быть заполнена",info);
		Assert.assertEquals(StopListStatus.OK, info.getStatus());
	}
	
	@Test
	public void getJuridicalStopListInfo_STOP(){
		stopListRequest.setInn(StopListDaoStub.INN_FOR_STOP_STATUS);
		StopListInfo info = stopListDao.getJuridicalStopListInfo(stopListRequest);
		Assert.assertNotNull("Информация должна быть заполнена",info);
		Assert.assertEquals(StopListStatus.STOP, info.getStatus());
	}
	
}
