package com.xumou.scd.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy //启用服务路由
@SpringCloudApplication // 相当于 @SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker 整合
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

}
