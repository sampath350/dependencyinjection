package com.di.javaclass;

import com.di.interfaces.IConsumerServices;
import com.di.interfaces.IMsg_Service;

public class DepdendencyInjectionApp implements IConsumerServices{

	private IMsg_Service service;
	
	public DepdendencyInjectionApp(IMsg_Service svc){
		this.service=svc;
	}
	
	public void processMessages(String msg, String rec){
		//do some msg validation, manipulation logic etc
		this.service.sendMessage(msg, rec);
	}

}