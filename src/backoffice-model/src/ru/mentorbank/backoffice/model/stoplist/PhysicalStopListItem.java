package ru.mentorbank.backoffice.model.stoplist;

import java.io.Serializable;

public class PhysicalStopListItem extends StopListItem implements Serializable {
	private static final long serialVersionUID = 1L;

	private String documentSeries;

	private String documentNumber;

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getDocumentSeries() {
		return documentSeries;
	}

	public void setDocumentSeries(String documentSeries) {
		this.documentSeries = documentSeries;
	}
}
