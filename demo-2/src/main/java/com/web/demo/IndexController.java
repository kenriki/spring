package com.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author rikigigasu
 */
@Controller
@EnableAutoConfiguration
public class IndexController {

	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", required = false, defaultValue = "hello") String name,
			Model model) {
		model.addAttribute("name", name);
		return "Hello/hello";
	}
	
	@RequestMapping("/formHoge")
	public String formHoge(@RequestParam(value = "name", required = false, defaultValue = "hello") String name,
			Model model) {
		model.addAttribute("name", name);
		return "Form/index";
	}

	@RequestMapping("/")
	public String root(@RequestParam(value = "name", required = false, defaultValue = "test") String name,
			Model model) {
		model.addAttribute("name", name);
		return "index";
	}

}