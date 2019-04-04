package com.xumou.scd.feign.client;

import org.springframework.stereotype.Component;

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

}
