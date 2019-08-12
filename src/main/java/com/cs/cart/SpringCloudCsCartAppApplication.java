package com.cs.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudCsCartAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCsCartAppApplication.class, args);
	}

}