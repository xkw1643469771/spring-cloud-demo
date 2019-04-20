package com.xumou.scd.feign.controller;

import com.xumou.scd.feign.client.WebOneClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FeignController {
	
	@Autowired
	WebOneClient webOneClient;
	
	@RequestMapping("info")
	public Object info(){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("123",123);
		map.put("456",123);
		map.put("789",123);
		return webOneClient.sendMap(map);
	}
	
}
