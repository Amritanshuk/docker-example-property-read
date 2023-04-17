package com.infy.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

	@Value("${nameRead}")
	private String nameRead;
	
	@GetMapping("/getname")
	public String getName() {
		return "hello docker "+ nameRead;
	}
}
