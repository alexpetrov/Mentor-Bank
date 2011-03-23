package ru.mentorbank.backoffice.dao;

import ru.mentorbank.backoffice.model.stoplist.JuridicalStopListRequest;
import ru.mentorbank.backoffice.model.stoplist.PhysicalStopListRequest;
import ru.mentorbank.backoffice.model.stoplist.StopListInfo;

public interface StopListDao {

	public StopListInfo getJuridicalStopListInfo(JuridicalStopListRequest request);
	
	public StopListInfo getPhysicalStopListInfo(PhysicalStopListRequest request);
}
