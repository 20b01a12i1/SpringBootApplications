package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApp {
	@RequestMapping("/")
	public String sayHi() {
		return "<h1>Hello Baby!!</h1>";
	}
	@RequestMapping("/tata")
	public String sayBye() {
		return "<h2>Good night!!! bye bye</h2>";
	}

}
