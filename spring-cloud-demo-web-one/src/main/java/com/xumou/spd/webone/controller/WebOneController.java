package com.xumou.spd.webone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WebOneController {
	
	@Value("${server.port}")
	String port;

	@RequestMapping("info")
	public String one(){
		return "WEB-ONE: " + port;
	}
	
	@RequestMapping("add")
	public int add(int a, int b){
		return a + b;
	}

	@RequestMapping(value = "sendMap", method = RequestMethod.POST)
	public Map<String,Integer> sendMap(@RequestBody Map<String,Integer> map){
		System.out.println(map);
		return map;
	}

}
