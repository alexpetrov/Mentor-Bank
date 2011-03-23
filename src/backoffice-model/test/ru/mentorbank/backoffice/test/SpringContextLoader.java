package ru.mentorbank.backoffice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextLoader;
import org.springframework.test.context.support.GenericXmlContextLoader;

/**
 * Загружает тестовый контекст
 * 
 * @author Роман Ержуков I-Teco 23.09.2010
 */
public class SpringContextLoader implements ContextLoader {
	
	private final String[] defaultLocations = { "/testContext.xml" };
	private final GenericXmlContextLoader loader = new GenericXmlContextLoader();

	public String[] processLocations(Class<?> clazz, String... locations) {
		return defaultLocations;
	}

	public ApplicationContext loadContext(String... locations) throws Exception {
		return loader.loadContext(locations);
	}
}
