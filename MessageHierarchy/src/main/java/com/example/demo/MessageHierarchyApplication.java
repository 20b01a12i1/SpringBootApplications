package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.Email;
import com.example.demo.service.MessageProcessor;
import com.example.demo.service.MessageProcessorImpl;
import com.example.demo.service.MessageService;
import com.example.demo.service.SMS;

@SpringBootApplication
public class MessageHierarchyApplication {

	@Bean
	public MessageService sms(){
		return new SMS();
	}
	@Bean
	public MessageService email() {
		return new Email();
	}
	@Bean
	public MessageProcessor processorimplem() {
		return new MessageProcessorImpl(email());
	}
	public static void main(String[] args) {
		MessageProcessor m=SpringApplication.run(MessageHierarchyApplication.class, args).getBean(MessageProcessor.class);
		m.processMsg();
	}

}
