package com.saxena.vaibhav.pictogram.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class PictogramZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PictogramZuulApiGatewayApplication.class, args);
	}

}
