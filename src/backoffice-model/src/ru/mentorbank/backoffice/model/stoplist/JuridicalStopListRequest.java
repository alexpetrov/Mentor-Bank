package ru.mentorbank.backoffice.model.stoplist;

import java.io.Serializable;

public class JuridicalStopListRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String inn;

	public String getInn() {
		return inn;
	}

	public void setInn(String inn) {
		this.inn = inn;
	}

}
