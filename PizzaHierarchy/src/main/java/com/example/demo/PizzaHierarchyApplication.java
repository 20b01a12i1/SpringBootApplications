package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.FastFoodProcessor;
import com.example.demo.service.NonVegPizza;
import com.example.demo.service.Pizza;
import com.example.demo.service.PizzaProcessor;
import com.example.demo.service.VegPizza;

@SpringBootApplication
public class PizzaHierarchyApplication {

	@Bean
	public Pizza vegpizza() {
		return new VegPizza();
	}
	@Bean
	public Pizza nonvegpizza() {
		return new NonVegPizza();
	}
	@Bean
	public FastFoodProcessor pizzaprocessor() {
		return new PizzaProcessor(vegpizza());
//		return new PizzaProcessor(nonvegpizza());
	}
	
	public static void main(String[] args) {
		FastFoodProcessor food=SpringApplication.run(PizzaHierarchyApplication.class, args).getBean(FastFoodProcessor.class);
		food.prepare();
	}

}
