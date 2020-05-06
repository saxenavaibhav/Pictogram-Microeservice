package com.saxena.vaibhav.pictogram.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PictogramApiAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PictogramApiAccountManagementApplication.class, args);
	}

}
