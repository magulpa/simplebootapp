package com.rest.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@RequestMapping("/demo")
	public DemoDto getDetails() {
		return demoService.getDemodetails();
	}

}
