package com.xumou.spd.webthree.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebThreeController {
	
	@Value("${server.port}")
	String port;

	@RequestMapping("info")
	public String one(){
		return "WEB-THREE: " + port;
	}
	
	@RequestMapping("add")
	public int add(int a, int b){
		return a + b;
	}
	
}
