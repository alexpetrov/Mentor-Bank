package ru.mentorbank.backoffice.services.stoplist;

import ru.mentorbank.backoffice.model.stoplist.JuridicalStopListRequest;
import ru.mentorbank.backoffice.model.stoplist.PhysicalStopListRequest;
import ru.mentorbank.backoffice.model.stoplist.StopListInfo;

public interface StopListService {

	public StopListInfo getJuridicalStopListInfo(JuridicalStopListRequest request);
	
	public StopListInfo getPhysicalStopListInfo(PhysicalStopListRequest request);
}
