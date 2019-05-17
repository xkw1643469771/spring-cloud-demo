package com.xumou.scd.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "WEB-ONE", fallback = WebOneClientImpl.class)
public interface WebOneClient {
	
	@RequestMapping("info")
	String info();

	// @RequestParam 表示发送参数， 可以定义多个
	@RequestMapping("add")
	int add(@RequestParam("a") int a, @RequestParam("b") int b);

	// @RequestBody 表示发送json， 只能写一个
	@RequestMapping(value = "/sendMap", method = RequestMethod.POST)
	Map<String, Integer> sendMap(@RequestBody Map<String, Integer> map);

}
