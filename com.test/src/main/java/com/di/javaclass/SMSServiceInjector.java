package com.di.javaclass;

import com.di.interfaces.IConsumerServices;
import com.di.interfaces.IMsgServiceInjector;

public class SMSServiceInjector implements IMsgServiceInjector {

	public SMSServiceInjector() {
	}

	public SMSServiceInjector(String scope) {
		new DepdendencyInjectionApp(new SMSServiceInjector());
	}
	public IConsumerServices getConsumer() {
		return new DepdendencyInjectionApp(new SMSServiceImpl());
	}

}