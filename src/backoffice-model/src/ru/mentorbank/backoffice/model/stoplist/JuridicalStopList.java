package ru.mentorbank.backoffice.model.stoplist;

import java.io.Serializable;
import java.util.Set;

public class JuridicalStopList implements Serializable {

	private static final long serialVersionUID = 1L;

	private Set<JuridicalStopListItem> stopList;

	public Set<JuridicalStopListItem> getStopList() {
		return stopList;
	}

	public void setStopList(Set<JuridicalStopListItem> stopList) {
		this.stopList = stopList;
	}

}
