package com.di.javaclass;

import com.di.interfaces.IConsumerServices;
import com.di.interfaces.IMsgServiceInjector;

public class SMSServiceInjector implements IMsgServiceInjector {

	public IConsumerServices getConsumer() {
		return new DepdendencyInjectionApp(new SMSServiceImpl());
	}

}