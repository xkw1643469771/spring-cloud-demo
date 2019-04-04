package com.xumou.scd.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "WEB-ONE", fallback = WebOneClientImpl.class)
public interface WebOneClient {
	
	@RequestMapping("info")
	String info();
	
	@RequestMapping("add")
	int add(@RequestParam("a") int a, @RequestParam("b") int b);
}
