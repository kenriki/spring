package com.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.demo.IndexController;

@SpringBootApplication
public class WebDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(IndexController.class, args);
	}

}
