package com.xumou.spd.webthree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WebThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebThreeApplication.class, args);
	}

}
