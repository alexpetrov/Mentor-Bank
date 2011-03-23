package ru.mentorbank.backoffice.model.stoplist;

import java.io.Serializable;
import java.util.Set;

public class PhysicalStopList implements Serializable {
	private static final long serialVersionUID = 1L;

	private Set<PhysicalStopList> stopList;

	public Set<PhysicalStopList> getStopList() {
		return stopList;
	}

	public void setStopList(Set<PhysicalStopList> stopList) {
		this.stopList = stopList;
	}
}
