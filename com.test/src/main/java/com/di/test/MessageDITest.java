package com.di.test;

import com.di.interfaces.IConsumerServices;
import com.di.interfaces.IMsgServiceInjector;
import com.di.javaclass.EmailServiceInjector;
import com.di.javaclass.SMSServiceInjector;
// Created by Sampath 24/06/2020
public class MessageDITest {
	
	public static void main(String[] args) {
		String msg = "Hi Sampath";
		String email = "sampath@sg.com";
		String phone = "94522234";
		IMsgServiceInjector injector = null;
		IConsumerServices app = null;
		
		try {
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
		
		//Singleton call
		injector = new EmailServiceInjector("E");
		app=injector.getConsumer();
		app.processMessages("This is Singleton", "kumar@gmail.com");
	
		}
		catch (Exception e) {
			System.out.println("Exception "+e);
		}
	}

}
