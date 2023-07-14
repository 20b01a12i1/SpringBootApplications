package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessorImpl implements MessageProcessor {
	
	public MessageService msg;
	

	@Autowired
	public MessageProcessorImpl(@Qualifier("Sendme") MessageService msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void processMsg() {
		// TODO Auto-generated method stub
		msg.sendMsg();
	}

}
