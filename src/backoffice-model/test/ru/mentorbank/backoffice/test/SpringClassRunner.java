package ru.mentorbank.backoffice.test;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Устанавливает загрузчик контекста по-умолчанию
 * 
 * @author Роман Ержуков I-Teco 23.09.2010
 */
public class SpringClassRunner extends SpringJUnit4ClassRunner {
	private static final String CLASS_LOADER = SpringContextLoader.class.getName();

	public SpringClassRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}

	@Override
	protected TestContextManager createTestContextManager(Class<?> clazz) {
		return super.createTestContextManager(clazz);
	}

	@Override
	protected String getDefaultContextLoaderClassName(Class<?> clazz) {
		return CLASS_LOADER;
	}
}
