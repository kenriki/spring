package com.web.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.demo.bean.Syain;

@RestController
@RequestMapping("/test1")
public class MainController {

	@RequestMapping(value = "/index", produces = "application/json", method = { RequestMethod.GET, RequestMethod.PUT })
	@ResponseBody
	public Syain output1(@RequestBody Syain syain) {
		System.out.println(syain.getBangou());
		System.out.println(syain.getName());
		return syain;
	}
}