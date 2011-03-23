package ru.mentorbank.backoffice.model.transfer;

public class PhysicalAccountInfo extends AccountInfo {

	private static final long serialVersionUID = 1L;

	private String documentSeries;

	private String documentNumber;
	
	private String firstname;
	private String lastname;
	private String middlename;
	public String getDocumentSeries() {
		return documentSeries;
	}
	public void setDocumentSeries(String documentSeries) {
		this.documentSeries = documentSeries;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

}
