package com.rest.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	public DemoDto getDemodetails() {
		DemoDto demoDto = new DemoDto();
		demoDto.setDemoId("1");
		demoDto.setDemoName("abc");
		return demoDto;
		
	}

}
