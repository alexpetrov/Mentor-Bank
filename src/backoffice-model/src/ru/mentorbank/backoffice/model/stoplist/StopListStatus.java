package ru.mentorbank.backoffice.model.stoplist;

public enum StopListStatus {
	OK("ОK"), ASKSECURITY("Запросить разрешение в службе безопасности"), STOP(
			"Блокировать операцию");
	private final String value;

	private StopListStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;

	}
}
