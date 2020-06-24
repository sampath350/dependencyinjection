package com.di.javaclass;

import com.di.interfaces.IMsgService;

public class SMSServiceImpl implements IMsgService {

	public void sendMessage(String msg, String rec) {
		//logic to send SMS
		System.out.println("SMS sent to "+rec+ " with Message="+msg);
	}

}

