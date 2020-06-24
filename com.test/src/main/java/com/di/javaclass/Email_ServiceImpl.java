package com.di.javaclass;

import com.di.interfaces.IMsg_Service;

public class Email_ServiceImpl implements IMsg_Service {

	
	public void sendMessage(String msg, String rec) {
		//logic to send email
		System.out.println("***Email Sent to "+rec+ " With Message="+msg+"***");
	}

}


