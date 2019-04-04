package com.xumou.scd.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class RibbonService {

	@Autowired
	RestTemplate restTemplate;
	
	// 不使用断路器
	public String info(){
		String url = "http://WEB-ONE/info";
		return restTemplate.getForObject(url , String.class);
	}
	
	// 使用断路器
	@HystrixCommand(fallbackMethod = "infoError")
	public String infoUseHystrix(){
		String url = "http://WEB-ONE/info";
		return restTemplate.getForObject(url , String.class);
	}
	
	// 断路器回调方法
	public String infoError(){
		return "infoError";
	}
	
}
