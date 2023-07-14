package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PizzaProcessor implements FastFoodProcessor {
	public Pizza pizza;
	
	@Autowired
	public PizzaProcessor(@Qualifier("ThinCrustPizza") Pizza pizza) {
		super();
		this.pizza = pizza;
	}


	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		pizza.preparePizza();
		
	}
	
}
