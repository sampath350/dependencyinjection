package com.di.javaclass;

import com.di.interfaces.IConsumerServices;
import com.di.interfaces.IMsgServiceInjector;

public class EmailServiceInjector implements IMsgServiceInjector {
	public EmailServiceInjector() {
	}

	public EmailServiceInjector(String scope) {
		new DepdendencyInjectionApp(new EmailServiceImpl());
	}

	public IConsumerServices getConsumer() {
		return new DepdendencyInjectionApp(new EmailServiceImpl());
	}

}
