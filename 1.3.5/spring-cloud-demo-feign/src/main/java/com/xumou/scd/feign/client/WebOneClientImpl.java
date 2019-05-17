package com.xumou.scd.feign.client;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// Feign断路后回调类
@Component
public class WebOneClientImpl implements WebOneClient{

	@Override
	public String info() {
		return "FeignInfo";
	}

	@Override
	public int add(int a, int b) {
		return 0;
	}

	@Override
	public Map<String, Integer> sendMap(Map<String, Integer> map) {
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("error", 500);
		return map2;
	}

}
