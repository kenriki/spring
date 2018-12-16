package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.example.web.helloSamplePage.CustomerController;

@ComponentScan
@EnableAutoConfiguration
public class MyApp {
	public static void main(String[] args) {
		SpringApplication.run(CustomerController.class, args);
	}
}
