package com.di.javaclass;

import com.di.interfaces.IConsumerServices;
import com.di.interfaces.IMsgService;

public class DepdendencyInjectionApp implements IConsumerServices {

	private IMsgService service;

	public DepdendencyInjectionApp(IMsgService svc) {
		this.service = svc;
	}

	public DepdendencyInjectionApp(Object obj) {

		if (service == null) {
			if (obj instanceof EmailServiceImpl)
				service = new EmailServiceImpl();
			else
				service = new SMSServiceImpl();

		}
	}

	public void processMessages(String msg, String rec) {
		// do some msg validation, manipulation logic etc
		this.service.sendMessage(msg, rec);
	}

}