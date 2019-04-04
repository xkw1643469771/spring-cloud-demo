package com.xumou.scd.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xumou.scd.feign.client.WebOneClient;

@RestController
public class FeignController {
	
	@Autowired
	WebOneClient webOneClient;
	
	@RequestMapping("info")
	public String info(){
		return webOneClient.info();
	}
	
}
