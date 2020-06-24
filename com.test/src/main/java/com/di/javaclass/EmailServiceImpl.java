package com.di.javaclass;

import com.di.interfaces.IMsgService;

public class EmailServiceImpl implements IMsgService {

	
	public void sendMessage(String msg, String rec) {
		//logic to send email
		System.out.println("Email sent to "+rec+ " with Message="+msg);
	}

}


