package com.di.javaclass;

import com.di.interfaces.IMsg_Service;

public class SMSServiceImpl implements IMsg_Service {

	public void sendMessage(String msg, String rec) {
		//logic to send SMS
		System.out.println("*** SMS Sent to "+rec+ " With Message="+msg+"***");
	}

}

