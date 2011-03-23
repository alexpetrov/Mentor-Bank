package ru.mentorbank.backoffice.model.stoplist;

import java.io.Serializable;

public class StopListInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private StopListStatus status;

	private String comment;

	public StopListStatus getStatus() {
		return status;
	}

	public void setStatus(StopListStatus status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
