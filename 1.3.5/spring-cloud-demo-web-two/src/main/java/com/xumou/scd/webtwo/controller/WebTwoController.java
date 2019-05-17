package com.xumou.scd.webtwo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebTwoController {
	
	@Value("${server.port}")
	String port;
	@Value("${name}")
	String name;

	@RequestMapping("info")
	public String one(){
		return "WEB-ONE: " + port;
	}
	
	@RequestMapping("name")
	public String name(){
		return name;
	}
	
}
