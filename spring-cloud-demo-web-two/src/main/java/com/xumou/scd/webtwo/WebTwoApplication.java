package com.xumou.scd.webtwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //启用注册中心
public class WebTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebTwoApplication.class, args);
	}

}
