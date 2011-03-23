package ru.mentorbank.backoffice.model.transfer;

public class JuridicalAccountInfo extends AccountInfo {

	private static final long serialVersionUID = 1L;
	private String inn;

	public String getInn() {
		return inn;
	}

	public void setInn(String inn) {
		this.inn = inn;
	}
}
